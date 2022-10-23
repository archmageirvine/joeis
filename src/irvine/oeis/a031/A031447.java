package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031447 Numbers whose base-2 representation has 4 more 0's than 1's.
 * @author Sean A. Irvine
 */
public class A031447 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.bitCount() * 2 == mN.bitLength() - 4) {
        return mN;
      }
    }
  }
}
