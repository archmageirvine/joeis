package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059628 Carryless multiplication 5 X n base 10.
 * @author Sean A. Irvine
 */
public class A059628 extends A059627 {

  @Override
  public Z next() {
    return nimSum(10, super.next(), mN);
  }
}

