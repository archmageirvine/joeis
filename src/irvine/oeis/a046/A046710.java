package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046710 Irrational unitary-phi amicable numbers: numbers a such that uphi(a) = uphi(b) = 2*(a^2-b^2)^(1/2) where uphi = A047994.
 * @author Sean A. Irvine
 */
public class A046710 extends A046709 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
