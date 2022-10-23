package irvine.oeis.a055;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055744 Numbers k such that k and phi(k) have same prime factors.
 * @author Sean A. Irvine
 */
public class A055744 extends Sequence1 {

  private long mN = -2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN == 0) {
        return Z.ONE;
      }
      final FactorSequence fs = Jaguar.factor(mN);
      if (Arrays.equals(Jaguar.factor(fs.phi()).toZArray(), fs.toZArray())) {
        return Z.valueOf(mN);
      }
    }
  }
}
