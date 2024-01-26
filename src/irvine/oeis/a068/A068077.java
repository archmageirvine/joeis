package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068077 Numbers n such that sigma(n)+sigma(n+1)=4n.
 * @author Sean A. Irvine
 */
public class A068077 extends Sequence1 {

  private long mN = 0;
  private Z mSigma = Jaguar.factor(1).sigma();

  @Override
  public Z next() {
    while (true) {
      final Z t = mSigma;
      mSigma = Jaguar.factor(++mN + 1).sigma();
      if (t.add(mSigma).equals(Z.valueOf(4 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
