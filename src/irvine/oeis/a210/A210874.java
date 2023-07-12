package irvine.oeis.a210;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A210874 Triangular array U(n,k) of coefficients of polynomials defined in Comments.
 * @author Georg Fischer
 */
public class A210874 extends Triangle {

  /** Construct the sequence. */
  public A210874() {
    this(1, 2, 3);
  }

  /**
   * Generic constructor with parameters.
   * @param inits initial terms
   */
  public A210874(final long... inits) {
    super(inits);
    setOffset(1);
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    if (n <= 1) {
      return super.compute(n, k);
    } else if (k == 0) {
      return Z.valueOf(n + 1);
    } else if (k == 1) {
      return Z.valueOf(n + 1).add(get(n - 1, 0));
    } else {
      return get(n - 1, k - 1).add(get(n - 2, k - 2));
    }
  }
}
