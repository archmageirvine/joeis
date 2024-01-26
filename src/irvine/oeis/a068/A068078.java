package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068078 Numbers n such that (sigma(n)+sigma(n+1))/n is an integer.
 * @author Sean A. Irvine
 */
public class A068078 extends Sequence1 {

  private long mN = 0;
  private Z mSigma = Jaguar.factor(1).sigma();

  @Override
  public Z next() {
    while (true) {
      final Z t = mSigma;
      mSigma = Jaguar.factor(++mN + 1).sigma();
      if (t.add(mSigma).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
