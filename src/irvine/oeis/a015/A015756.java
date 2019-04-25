package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015756 <code>a(n)</code> is the least multiple of <code>n, k*n</code> say, such that phi(k) | <code>sigma(k)</code>.
 * @author Sean A. Irvine
 */
public class A015756 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    while (true) {
      final FactorSequence fs = Cheetah.factor(k);
      if (fs.sigma().mod(fs.phi()).equals(Z.ZERO)) {
        return Z.valueOf(k);
      }
      k += mN;
    }
  }
}
