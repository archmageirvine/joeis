package irvine.oeis.a394;

import irvine.math.z.Z;

/**
 * A394950 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A394950 extends A394948 {

  @Override
  protected Z b(final long n) {
    return n == 1 ? Z.ONE : a(n - 1).multiply(4);
  }
}
