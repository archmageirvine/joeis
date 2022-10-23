package irvine.oeis.a027;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027598 Numbers k such that the set of prime divisors of k is equal to the set of prime divisors of sigma(k).
 * @author Sean A. Irvine
 */
public class A027598 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Arrays.equals(fs.toZArray(), Jaguar.factor(fs.sigma()).toZArray())) {
        return Z.valueOf(mN);
      }
    }
  }
}
