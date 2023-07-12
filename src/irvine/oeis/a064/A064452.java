package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064452 Integers which are not primes or powers of primes such that for all j&gt;i Phi(j)/j &gt; Phi(i)/i.
 * @author Sean A. Irvine
 */
public class A064452 extends Sequence1 {

  private Z mPhi = Z.ZERO;
  private long mA = 1;
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.omega() > 1) {
        final Z phi = fs.phi();
        if (phi.multiply(mA).compareTo(mPhi.multiply(mN)) > 0) {
          mA = mN;
          mPhi = fs.phi();
          return Z.valueOf(mN);
        }
      }
    }
  }
}
