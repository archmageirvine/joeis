package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031444 Numbers whose base-2 representation has one more 0 than 1's.
 * @author Sean A. Irvine
 */
public class A031444 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.bitCount() * 2 == mN.bitLength() - 1) {
        return mN;
      }
    }
  }
}
