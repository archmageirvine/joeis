package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068078 Numbers n such that (sigma(n)+sigma(n+1))/n is an integer.
 * @author Sean A. Irvine
 */
public class A068078 extends Sequence1 {

  private long mN = 0;
  private Z mSigma = Functions.SIGMA1.z(1);

  @Override
  public Z next() {
    while (true) {
      final Z t = mSigma;
      mSigma = Functions.SIGMA1.z(++mN + 1);
      if (t.add(mSigma).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
