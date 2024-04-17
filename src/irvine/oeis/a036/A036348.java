package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036348 Even numbers whose number of odd prime factors is odd (when counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036348 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.SOPFR.z(mN).isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}
