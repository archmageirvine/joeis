package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031447 Numbers whose base-2 representation has 4 more 0's than 1's.
 * @author Sean A. Irvine
 */
public class A031447 implements Sequence {

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
