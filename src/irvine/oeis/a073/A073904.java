package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073904 Smallest multiple k*n of n having n divisors.
 * @author Sean A. Irvine
 */
public class A073904 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN == 4) {
      return Z.EIGHT;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    if (fs.omega() == 1) {
      if (fs.bigOmega() == 1) {
        // mN is prime
        return Z.valueOf(mN).pow(mN - 1);
      } else if (fs.bigOmega() == 2) {
        // mN = p^2
        final Z p = fs.toZArray()[0];
        final long pp = p.longValueExact();
        return p.pow(pp - 1).shiftLeft(pp - 1);
      }
    }
    long m = mN;
    while (true) {
      if (Functions.SIGMA0.l(m) == mN) {
        return Z.valueOf(m);
      }
      m += mN;
    }
  }
}

