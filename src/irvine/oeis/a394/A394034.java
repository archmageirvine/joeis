package irvine.oeis.a394;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394034 Rectangular array, read by descending antidiagonals: numerators in the best lower approximating array to the golden ratio, phi (A001622). (See A394033.).
 * @author Sean A. Irvine
 */
public class A394034 extends Sequence1 {

  private final CR mX;
  private final HashSet<Z> mUsedDen = new HashSet<>();
  private final ArrayList<List<Q>> mB = new ArrayList<>();
  private Z mLeastUnusedDen = Z.ONE;
  private int mN = 0;
  private int mM = -1;

  protected A394034(final CR x) {
    mX = x;
  }

  /** Construct the sequence. */
  public A394034() {
    this(CR.PHI);
  }

  protected Z select(final Q n) {
    //System.out.println("frac = " + n);
    return n.num();
  }

  protected Q b(final int n, final int m) {
    while (mUsedDen.contains(mLeastUnusedDen)) {
      mLeastUnusedDen = mLeastUnusedDen.add(1);
    }
    if (n >= mB.size() || m >= mB.get(n).size()) {
      final Q prev = n >= mB.size() ? Q.ZERO : mB.get(n).get(m - 1);
      Z d = mLeastUnusedDen;
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
        final Q q = new Q(mX.multiply(d).floor(), d);
        if (q.compareTo(prev) > 0 && mUsedDen.add(q.den())) {
          if (prev.isZero()) {
            final List<Q> lst = new ArrayList<>();
            lst.add(q);
            mB.add(lst);
          } else {
            mB.get(n).add(q);
          }
          return q;
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

