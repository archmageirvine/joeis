package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059630 Carryless multiplication 7 X n base 10.
 * @author Sean A. Irvine
 */
public class A059630 extends A059629 {

  @Override
  public Z next() {
    return nimSum(10, super.next(), mN);
  }
}

