package irvine.oeis.a394;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394037 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394037 extends Sequence1 {

  // todo not working right, order dependent?

  private final CR mX;
  private final List<HashSet<Z>> mUsedDen = new ArrayList<>();
  private final ArrayList<List<Q>> mB = new ArrayList<>();
  private final HashSet<Q> mUsed = new HashSet<>();
  private final Q mStart;
  private int mN = 0;
  private int mM = -1;

  protected A394037(final CR x) {
    mX = x;
    mStart = Q.valueOf(mX.ceil().add(1));
  }

  /** Construct the sequence. */
  public A394037() {
    this(CR.PHI);
  }

  protected Z select(final Q n) {
    //System.out.println("frac = " + n);
    return n.den();
  }

  protected Q b(final int n, final int m) {
    if (n >= mUsedDen.size()) {
      mUsedDen.add(new HashSet<>());
    }
    Z den = Z.ONE;
    final HashSet<Z> used = mUsedDen.get(n);
    while (used.contains(den)) {
      den = den.add(1);
    }
    if (n >= mB.size() || m >= mB.get(n).size()) {
      final CR prev = mX.subtract(CR.valueOf(n >= mB.size() ? mStart : mB.get(n).get(m - 1))).abs();
      Z d = den;
      while (true) {
        if (n > 0) {
          final List<Q> r = mB.get(n - 1);
          Z rd = r.get(r.size() - 1).den();
          while (d.compareTo(rd) > 0) {
            // Force computing of more terms for an earlier row
            b(n - 1, r.size());
            rd = r.get(r.size() - 1).den();
          }
        }
        final Q q = new Q(mX.multiply(d).round(), d);
        if (!mUsed.contains(q)) {
          // todo this is not right?
          System.out.println("n=" + n + " m=" + m + " trying: " + q + " -> " + mX.subtract(CR.valueOf(q)).abs() + " cf. " + prev);
          if (mX.subtract(CR.valueOf(q)).abs().compareTo(prev, -500) < 0 && used.add(q.den())) {
            if (n >= mB.size()) {
              final List<Q> lst = new ArrayList<>();
              lst.add(q);
              mB.add(lst);
            } else {
              mB.get(n).add(q);
            }
            mUsed.add(q);
            return q;
          }
        }
        d = d.add(1);
      }
    }
    return mB.get(n).get(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(b(mM, mN - mM));
  }
}

