package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068077 Numbers n such that sigma(n)+sigma(n+1)=4n.
 * @author Sean A. Irvine
 */
public class A068077 extends Sequence1 {

  private long mN = 0;
  private Z mSigma = Functions.SIGMA.z(1);

  @Override
  public Z next() {
    while (true) {
      final Z t = mSigma;
      mSigma = Functions.SIGMA.z(++mN + 1);
      if (t.add(mSigma).equals(4 * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
