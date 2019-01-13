package irvine.oeis.a159;

import irvine.math.z.Z;
import irvine.math.q.Q;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
import irvine.factor.factor.PrimeDivision;

/**
 * A159907.
 * @author Sean A. Irvine
 * @author Robert Gerbicz
 */
public class A159907 implements Sequence {

  private final Fast mPrime = new Fast();
  private final PrimeDivision mFactor = new PrimeDivision();
  private final HashSet<Z> mSeen = new HashSet<>();
  private final ArrayList<Z> mSorted = new ArrayList<>();
  private int mOutput = 0;
  private Z mBound = Z.valueOf(100L);

  private void find(final Z n, final Q k, final Z sp, final Z si) {
    if (new Q(si, n).equals(k)) {
      mSeen.add(n);
      return;
    }
    final Z k2 = k.multiply(2).toZ();
    final Z si2 = si.multiply2();
    if (mBound.compareTo(n.lcm(si2).divide(k2)) < 0) {
      return;
    }
    Z nn = n;
    Z p = sp;
    Q r = new Q(si, n);
    if (r.compareTo(k) > 0) {
      return;
    }
    while (nn.compareTo(mBound) <= 0) {
      p = mPrime.nextPrime(p);
      if (!Z.ZERO.equals(n.mod(p))) {
        nn = nn.multiply(p);
        r = r.multiply(new Q(p, p.subtract(1)));
      }
    }
    if (r.compareTo(k) < 0) {
      return;
    }
    final Z n2 = n.multiply(k2);
    final FactorSequence u = mFactor.factorize(si2);
    Z pr = Z.NEG_ONE;
    Z prim = Z.NEG_ONE;
    Z sz = Z.ONE;
    for (final Z f : u.toZArray()) {
      final int e = u.getExponent(f);
      final Z pe = f.pow(e);
      if (!Z.ZERO.equals(n2.mod(pe)) && (Z.ZERO.equals(n.mod(f)) || f.compareTo(sp) <= 0)) {
        return;
      }
      if (!Z.ZERO.equals(n2.mod(f))) {
        pr = pe;
        sz = sz.multiply(pr);
        prim = f;
      }
    }
    if (n.multiply(sz).compareTo(mBound) > 0) {
      return;
    }
    if (Z.NEG_ONE.equals(pr)) {
      p = sp;
      boolean imp = true;
      while (imp) {
        imp = Z.ZERO.equals(n.mod(p));
        p = mPrime.nextPrime(p);
        if (!Z.ZERO.equals(n.mod(p))) {
          Z q = Z.ONE;
          while (q.multiply(p).multiply(n).compareTo(mBound) <= 0) {
            q = q.multiply(p);
            nn = n.multiply(q);
            r = new Q(si.multiply(p), n.multiply(p.subtract(1)));
            Z p2 = p;
            while (nn.compareTo(mBound) <= 0) {
              p2 = mPrime.nextPrime(p2);
              nn = nn.multiply(p2);
              r = r.multiply(new Q(p2, p2.subtract(1)));
              if (r.compareTo(k) >= 0) {
                imp = true;
                find(n.multiply(q), k, p, si.multiply(q.multiply(p).subtract(1)).divide(p.subtract(1)));
              }
            }
          }
        }
      }
      return;
    }
    nn = n.multiply(pr);
    Z pr2 = pr;
    final Z mul = sz.divide(pr);
    while (nn.multiply(mul).compareTo(mBound) <= 0) {
      find(nn, k, sp, si.multiply(pr2.multiply(prim).subtract(1)).divide(prim.subtract(1)));
      pr2 = pr2.multiply(prim);
      nn = nn.multiply(prim);
    }
  }

  @Override
  public Z next() {
    while (mSeen.size() <= mOutput) {
      mBound = mBound.multiply(100);
      for (int k = 3; k < (int) Math.log(mBound.doubleValue()); k += 2) {
        Z n = Z.TWO;
        while (n.compareTo(mBound) < 0) {
          find(n, new Q(k, 2), Z.TWO, n.multiply2().subtract(1));
          n = n.multiply2();
        }
      }
      mSorted.clear();
      mSorted.addAll(mSeen);
      Collections.sort(mSorted);
    }
    return mSorted.get(mOutput++);
  }
}

