package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031448 Numbers n which in base 2 has one fewer 0's than 1's.
 * @author Sean A. Irvine
 */
public class A031448 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.bitCount() * 2 == mN.bitLength() + 1) {
        return mN;
      }
    }
  }
}
