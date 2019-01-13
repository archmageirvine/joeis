package irvine.math.elliptic;

import irvine.math.q.Q;
import irvine.math.IntegerUtils;

/**
 * An elliptic curve point.
 *
 * @author Sean A. Irvine
 */
public class EllipticCurvePoint {

  /** A zero. */
  public static final EllipticCurvePoint ZERO = new EllipticCurvePoint(null, null);

  private final Q mX;
  private final Q mY;

  /**
   * Construct a new point.
   * @param x x-coordinate
   * @param y y-coordinate
   */
  public EllipticCurvePoint(final Q x, final Q y) {
    mX = x;
    mY = y;
  }

  /**
   * The x-coordinate.
   * @return x-coordinate
   */
  public Q x() {
    return mX;
  }

  /**
   * The y-coordinate.
   * @return y-coordinate
   */
  public Q y() {
    return mY;
  }

  /**
   * Test if this point is the zero (i.e. infinity).
   * @return true if this is the point at infinity
   */
  public boolean isZero() {
    return mX == null;
  }

  private boolean equals(final Q a, final Q b) {
    return a == null ? a == b : a.equals(b);
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof EllipticCurvePoint)) {
      return false;
    }
    final EllipticCurvePoint that = (EllipticCurvePoint) other;
    return equals(x(), that.x()) && equals(y(), that.y());
  }

  private int hashCode(final Q x) {
    return x == null ? 0 : x.hashCode();
  }

  @Override
  public int hashCode() {
    return IntegerUtils.hash(hashCode(x()), hashCode(y()));
  }

  @Override
  public String toString() {
    return "(" + x() + "," + y() + ")";
  }
}
