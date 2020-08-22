package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018917 Define the generalized Pisot sequence T(a(0),a(1)) by: a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n). This is T(3,5).
 * @author Sean A. Irvine
 */
public class A018917 extends A018915 {

  @Override
  protected Z a() {
    return Z.THREE;
  }

  @Override
  protected Z b() {
    return Z.FIVE;
  }
}
