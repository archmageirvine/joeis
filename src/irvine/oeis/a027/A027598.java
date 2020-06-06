package irvine.oeis.a027;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027598 Numbers k such that the set of prime divisors of k is equal to the set of prime divisors of <code>sigma(k)</code>.
 * @author Sean A. Irvine
 */
public class A027598 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Arrays.equals(fs.toZArray(), Cheetah.factor(fs.sigma()).toZArray())) {
        return Z.valueOf(mN);
      }
    }
  }
}
