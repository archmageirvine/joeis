package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018923.
 * @author Sean A. Irvine
 */
public class A018923 extends A018915 {

  private static final Z Z16 = Z.valueOf(16);
  private static final Z Z32 = Z.valueOf(32);

  @Override
  protected Z a() {
    return Z16;
  }

  @Override
  protected Z b() {
    return Z32;
  }
}
