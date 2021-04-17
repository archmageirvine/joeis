package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046710 Irrational unitary-phi amicable numbers.
 * @author Sean A. Irvine
 */
public class A046710 extends A046709 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
