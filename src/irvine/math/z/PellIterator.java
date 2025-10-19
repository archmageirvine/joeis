package irvine.math.z;

import java.util.Iterator;

import irvine.util.AbstractIterator;

/**
 * Generate sequence of solutions <code>x,y</code> for <code>x^2-d*y^2=1</code>.
 * @author Sean A. Irvine
 */
public final class PellIterator extends AbstractIterator<Z[]> {
  private final Z mD;
  private Z mA = null;
  private Z mB = null;
  private Z mX = null;
  private Z mY = null;

  /**
   * Construct an iterator for the given discriminant.
   * @param d discriminant
   */
  public PellIterator(final Z d) {
    mD = d;
  }

  @Override
  public boolean hasNext() {
    return true; // Infinite solutions
  }

  @Override
  public Z[] next() {
    if (mA == null) {
      // Use continued fraction only to get first solution
      final Iterator<Z[]> sqrtConvergents = new SquareRootConvergentsIterator(mD);
      while (true) {
        final Z[] xy = sqrtConvergents.next();
        if (Z.ONE.equals(xy[0].multiply(xy[0]).subtract(xy[1].multiply(xy[1]).multiply(mD)))) {
          mX = xy[0];
          mY = xy[1];
          mA = mX;
          mB = mY;
          return new Z[] {mA, mB};
        }
      }
    }
    final Z x = mA.multiply(mX).add(mB.multiply(mY).multiply(mD));
    final Z y = mB.multiply(mX).add(mA.multiply(mY));
    mX = x;
    mY = y;
    return new Z[] {mX, mY};
  }
}
