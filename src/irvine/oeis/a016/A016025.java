package irvine.oeis.a016;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016025 Least k such that (tau(k^k)+k-1)/k=n.
 * @author Sean A. Irvine
 */
public class A016025 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      final FactorSequence fs = new FactorSequence();
      fs.add(++k, FactorSequence.UNKNOWN, k);
      Jaguar.factor(fs);
      if (fs.sigma0AsLong() + k - 1 == mN * k) {
        return Z.valueOf(k);
      }
    }
  }
}
