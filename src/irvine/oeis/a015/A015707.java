package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015707 Values of n where (phi(n) * sigma(n))/n is an integer and increases.
 * @author Sean A. Irvine
 */
public class A015707 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z a = fs.sigma().multiply(fs.phi());
      final Z[] qr = a.divideAndRemainder(mN);
      if (qr[1].isZero() && qr[0].compareTo(mBest) > 0) {
        mBest = qr[0];
        return mN;
      }
    }
  }
}
