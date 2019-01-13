package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015708.
 * @author Sean A. Irvine
 */
public class A015708 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mBest = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      final Z a = fs.sigma().multiply(fs.phi());
      final Z[] qr = a.divideAndRemainder(mN);
      if (qr[1].equals(Z.ZERO)) {
        if (qr[0].compareTo(mBest) <= 0) {
          return mN;
        } else {
          mBest = qr[0];
        }
      }
    }
  }
}
