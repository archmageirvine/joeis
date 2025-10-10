package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389340 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A389340 extends Sequence1 {

  private long mN = 2159;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.omega() != 3) {
      return false;
    }
    if (fs.maxExponent() - fs.minExponent() <= 1) {
      return false; // Cannot have a nonzero slope
    }
    final Z[] pqr = fs.toZArray();
    final int pe = fs.getExponent(pqr[0]);
    final int qe = fs.getExponent(pqr[1]);
    final int re = fs.getExponent(pqr[2]);
    return pqr[2].subtract(pqr[1]).multiply(qe - pe).equals(pqr[1].subtract(pqr[0]).multiply(re - qe));
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
