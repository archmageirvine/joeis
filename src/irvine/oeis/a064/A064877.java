package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064877 a(n) = n - (A064873(n) + A064874(n) + A064875(n) + A064876(n)).
 * @author Sean A. Irvine
 */
public class A064877 extends A064873 {

  @Override
  protected Z select(final long n, final long a, final long b, final long c, final long d) {
    return Z.valueOf(n - a - b - c - d);
  }
}

