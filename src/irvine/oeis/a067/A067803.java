package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067803 Numbers n such that sigma(n)-sigma(n+1)=n.
 * @author Sean A. Irvine
 */
public class A067803 extends Sequence1 {

  private long mN = 531;
  private Z mSigma = Functions.SIGMA1.z(532);

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z t = mSigma;
      mSigma = Functions.SIGMA1.z(mN + 1);
      if (t.subtract(mSigma).equals(n)) {
        return n;
      }
    }
  }
}
