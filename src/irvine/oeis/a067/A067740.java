package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067740 Smallest number k such that sigma(k)/sigma(phi(k)) = n.
 * @author Sean A. Irvine
 */
public class A067740 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final FactorSequence fs = Jaguar.factor(++k);
      if (fs.sigma().equals(Jaguar.factor(fs.phi()).sigma().multiply(mN))) {
        return Z.valueOf(k);
      }
    }
  }
}
