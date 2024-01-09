package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067806 Numbers n such that sigma(n+1)+sigma(n)=3n.
 * @author Sean A. Irvine
 */
public class A067806 extends Sequence1 {

  private long mN = 9;
  private Z mSigma = Jaguar.factor(10).sigma();

  @Override
  public Z next() {
    while (true) {
      final Z t = mSigma;
      mSigma = Jaguar.factor(++mN + 1).sigma();
      if (t.add(mSigma).equals(Z.valueOf(3 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
