package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064874 Second of four sequences representing the lexicographical minimal decomposition of n in 4 squares: n = A064873(n)^2 + a(n)^2 + A064875(n)^2 + A064876(n)^2.
 * @author Sean A. Irvine
 */
public class A064874 extends A064873 {

  @Override
  protected Z select(final long n, final long a, final long b, final long c, final long d) {
    return Z.valueOf(b);
  }
}

