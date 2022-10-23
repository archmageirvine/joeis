package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015708 Numbers k such that k | (phi(k) * sigma(k)) but (phi(k) + sigma(k))/k does not increase.
 * @author Sean A. Irvine
 */
public class A015708 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mBest = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z a = fs.sigma().multiply(fs.phi());
      final Z[] qr = a.divideAndRemainder(mN);
      if (qr[1].isZero()) {
        if (qr[0].compareTo(mBest) <= 0) {
          return mN;
        } else {
          mBest = qr[0];
        }
      }
    }
  }
}
