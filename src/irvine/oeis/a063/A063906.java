package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063906 Numbers m such that m = 2*sigma(m)/3 - 1.
 * @author Sean A. Irvine
 */
public class A063906 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z sigma = Functions.SIGMA.z(mN);
      if (sigma.mod(3) == 0 && sigma.divide(3).multiply2().equals(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
