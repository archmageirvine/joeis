package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066038 Numbers with at least two prime factors such that the sum of the prime factors is prime.
 * @author Sean A. Irvine
 */
public class A066038 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.omega() > 1 && ZUtils.sum(fs.toZArray()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
