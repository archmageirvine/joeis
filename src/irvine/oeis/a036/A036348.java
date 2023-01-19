package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036348 Even numbers whose number of odd prime factors is odd (when counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036348 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN).sopfr().isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}
