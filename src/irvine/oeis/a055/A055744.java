package irvine.oeis.a055;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055744 Numbers k such that k and phi(k) have same prime factors.
 * @author Sean A. Irvine
 */
public class A055744 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN == 0) {
        return Z.ONE;
      }
      final FactorSequence fs = Cheetah.factor(mN);
      if (Arrays.equals(Cheetah.factor(fs.phi()).toZArray(), fs.toZArray())) {
        return Z.valueOf(mN);
      }
    }
  }
}
