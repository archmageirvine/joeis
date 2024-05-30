package irvine.oeis.a349;
// manually inverse at 2023-07-24 10:20

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A349317 Triangle T(n,k): T(n,k) = 1 if gcd(n, k) &gt; 1, else 0.
 * @author Georg Fischer
 */
public class A349317 extends BaseTriangle {

  /** Construct the sequence. */
  public A349317() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (Functions.GCD.i(n, k) > 1) ? Z.ONE : Z.ZERO;
  }
}
