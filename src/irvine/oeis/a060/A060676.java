package irvine.oeis.a060;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060676 Numbers n such that sigma (x) = n has exactly 12 solutions.
 * @author Sean A. Irvine
 */
public class A060676 extends Sequence1 {

  private static final Z TWELVE = Z.valueOf(12);
  private Z mN = Z.valueOf(1510);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseSigma.countInverseSigma(mN).equals(TWELVE)) {
        return mN;
      }
    }
  }
}
