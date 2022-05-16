package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046386 Products of four distinct primes.
 * @author Sean A. Irvine
 */
public class A046386 implements Sequence {

  private long mN = 209;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() == 4 && fs.omega() == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
