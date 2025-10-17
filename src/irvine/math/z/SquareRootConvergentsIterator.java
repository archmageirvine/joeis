package irvine.math.z;

import irvine.util.AbstractIterator;

/**
 * Generate sequence of convergents h,k for sqrt(root).
 * @author Sean A. Irvine
 */
final class SquareRootConvergentsIterator extends AbstractIterator<Z[]> {
  private Z mH = Z.ONE;
  private Z mHH = Z.ZERO;
  private Z mK = Z.ZERO;
  private Z mKK = Z.ONE;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private final Z mC;
  private Z mD = Z.ONE;

  private static boolean tooBig(final Z a, final Z b, final Z c, final Z d, final Z x) {
    // Polynomial for which r is root
    final Z y = d.multiply(x).square().subtract(a.multiply(d).multiply(x).multiply2()).add(a.square()).subtract(b.square().multiply(c));
    return y.signum() > 0;
  }

  // Exact calculation of int(r), where r=(a + b sqrt(c))/d
  private static Z floorQuadraticIrrational(final Z a, final Z b, final Z c, final Z d) {
    // Get a starting point
    final Z x = a.add(b.multiply(c.sqrt())).divide(d);
    Z e = Z.ONE;
    Z lo, hi;
    if (tooBig(a, b, c, d, x)) {
      while (tooBig(a, b, c, d, x.subtract(e))) {
        e = e.multiply2();
      }
      lo = x.subtract(e);
      hi = x.subtract(e.divide2());
    } else {
      while (!tooBig(a, b, c, d, x.add(e))) {
        e = e.multiply2();
      }
      lo = x.add(e.divide2());
      hi = x.add(e);
    }
    while (hi.subtract(lo).compareTo(Z.ONE) > 0) {
      final Z mid = hi.add(lo).divide2();
      if (tooBig(a, b, c, d, mid)) {
        hi = mid;
      } else {
        lo = mid;
      }
    }
    return lo;
  }

  SquareRootConvergentsIterator(final Z root) {
    mC = root;
  }

  @Override
  public boolean hasNext() {
    return true; // Infinite solutions
  }

  @Override
  public Z[] next() {
    final Z fqi = floorQuadraticIrrational(mA, mB, mC, mD);
    final Z t = mH.multiply(fqi).add(mHH);
    mHH = mH;
    mH = t;
    final Z u = mK.multiply(fqi).add(mKK);
    mKK = mK;
    mK = u;
    final Z[] res = {mH, mK};
    mA = mA.subtract(mD.multiply(fqi));
    final Z a = mA.multiply(mD);
    final Z b = mB.multiply(mD).negate();
    final Z d = mA.square().subtract(mB.square().multiply(mC));
    final Z g = a.gcd(b).gcd(d);
    mA = a.divide(g);
    mB = b.divide(g);
    mD = d.divide(g);
    return res;
  }
}
