package irvine.oeis.a079;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079881 mpf(n)^Omega(n), where mpf(n) is the median prime factor of n (A079879).
 * @author Sean A. Irvine
 */
public class A079881 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final long omega = fs.bigOmega();
    long k = 0;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      k += e;
      if (2 * k >= omega) {
        return p.pow(omega);
      }
    }
    return Z.ONE;
  }
}

