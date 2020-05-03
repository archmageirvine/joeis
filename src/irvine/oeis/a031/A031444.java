package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031444 In base 2 has one more <code>0</code>'s than <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A031444 implements Sequence {

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
