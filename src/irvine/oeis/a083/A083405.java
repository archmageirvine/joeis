package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a066.A066531;

/**
 * A066531 Numbers which can be expressed as the product of a number and its reversal in at least two different ways.
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
