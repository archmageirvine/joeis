package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086559 a(n) = (smallest n-digit number beginning with n and having prime signature of n)- (smallest n-digit number beginning with n).
 * @author Sean A. Irvine
 */
public class A086559 extends A086558 {

  @Override
  protected Z select(final Z u, final Z v) {
    return u.subtract(v);
  }
}
