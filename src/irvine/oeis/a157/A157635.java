package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157635 Triangle read by rows: T(n,m) = 1 if n*m*(n-m) = 0, and n*m*(n-m) otherwise.
 * @author Georg Fischer
 */
public class A157635 extends Triangle {

  /** Construct the sequence. */
  public A157635() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int m) {
    return n * m * (n - m) == 0 ? Z.ONE : Z.valueOf(n).multiply(m).multiply(n - m);
  }
}
