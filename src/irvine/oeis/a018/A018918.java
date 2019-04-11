package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018918 Define the generalized Pisot sequence T(a(0),a(1)) by: <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n)</code>. This is T(3,6).
 * @author Sean A. Irvine
 */
public class A018918 extends A018917 {

  @Override
  protected Z b() {
    return Z.SIX;
  }
}
