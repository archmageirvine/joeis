package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a066.A066531;

/**
 * A083405 Odd numbers which can be expressed as the product of a number and its reversal in at least two different ways.
 * @author Sean A. Irvine
 */
public class A083405 extends A066531 {

  private long mN = 12494207;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
