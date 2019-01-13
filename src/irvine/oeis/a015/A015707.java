package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015707.
 * @author Sean A. Irvine
 */
public class A015707 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      final Z a = fs.sigma().multiply(fs.phi());
      final Z[] qr = a.divideAndRemainder(mN);
      if (qr[1].equals(Z.ZERO) && qr[0].compareTo(mBest) > 0) {
        mBest = qr[0];
        return mN;
      }
    }
  }
}
