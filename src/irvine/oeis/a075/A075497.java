package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A075497 Stirling2 triangle with scaled diagonals (powers of 2).
 * a(n, m) = 2*m*a(n-1, m) + a(n-1, m-1), n &gt;= m &gt;= 1, else 0, with a(n, 0) := 0 and a(1, 1)=1.
 * @author Georg Fischer
 */
public class A075497 extends Triangle {

  protected int mPower;

  /** Construct the sequence. */
  public A075497() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param power exponent
   */
  public A075497(final int power) {
    mPower = power;
  }

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    return get(n - 1, k).multiply(mPower * (long) (k + 1)).add(get(n - 1, k - 1));
  }
}
