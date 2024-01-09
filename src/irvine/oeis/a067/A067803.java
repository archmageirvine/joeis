package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067803 Numbers n such that sigma(n)-sigma(n+1)=n.
 * @author Sean A. Irvine
 */
public class A067803 extends Sequence1 {

  private long mN = 531;
  private Z mSigma = Jaguar.factor(532).sigma();

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z t = mSigma;
      mSigma = Jaguar.factor(mN + 1).sigma();
      if (t.subtract(mSigma).equals(n)) {
        return n;
      }
    }
  }
}
