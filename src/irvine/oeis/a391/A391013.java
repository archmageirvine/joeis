package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391013 a(n) is the least k such that a k-gon is the first polygon where an agreement of the areas of k-gons inscribed and circumscribed to a unit circle agree with the true value of Pi when truncated to n digits.
 * @author Sean A. Irvine
 */
public class A391013 extends Sequence1 {

  private CR inscribe(final Z n) {
    return CR.TAU.divide(n).sin().multiply(n).divide(2);
  }

  private CR circumscribe(final Z n) {
    return CR.PI.divide(n).tan().multiply(n);
  }

  private boolean agreement(final Z t, final CR a, final CR b) {
    return a.multiply(t).floor().equals(b.multiply(t).floor());
  }

  private int mN = 0;
  private Z mM = Z.THREE;

  private Z search(final Z t, final Z lo, final Z hi) {
    if (lo.add(1).compareTo(hi) >= 0) {
      return hi;
    }
    final Z mid = lo.add(hi.subtract(lo).divide2());
    if (agreement(t, inscribe(mid), circumscribe(mid))) {
      return search(t, lo, mid);
    } else {
      return search(t, mid, hi);
    }
  }

  @Override
  public Z next() {
    final Z t = Z.TEN.pow(mN++);
    if (agreement(t, inscribe(mM), circumscribe(mM))) {
      return mM; // We already have the solution
    }
    Z hi = mM;
    Z lo = mM;
    while (!agreement(t, inscribe(hi), circumscribe(hi))) {
      lo = hi;
      hi = hi.multiply2();
    }
    // solution is in [lo, hi]
    mM = search(t, lo, hi);
    return mM;
  }
}
