package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015756 a(n) is the least multiple of n, k*n say, such that phi(k) | sigma(k).
 * @author Sean A. Irvine
 */
public class A015756 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    while (true) {
      final FactorSequence fs = Jaguar.factor(k);
      if (fs.sigma().mod(fs.phi()).isZero()) {
        return Z.valueOf(k);
      }
      k += mN;
    }
  }
}
