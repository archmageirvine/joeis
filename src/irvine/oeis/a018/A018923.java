package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018923 Define the generalized Pisot sequence T(a(0),a(1)) by: <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n)</code>. This is T(16,32).
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
