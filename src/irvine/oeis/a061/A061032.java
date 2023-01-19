package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061032 Factorial splitting: write n! = x*y*z with x&lt;y&lt;z and x maximal and z is minimal; sequence gives value of z.
 * @author Sean A. Irvine
 */
public class A061032 extends A061030 {

  @Override
  protected Z select(final Z x, final Z y, final Z z) {
    return z;
  }
}
