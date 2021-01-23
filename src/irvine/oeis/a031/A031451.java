package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031451 n-th number k which in base 2 has 4 fewer 0's than 1's.
 * @author Sean A. Irvine
 */
public class A031451 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.bitCount() * 2 == mN.bitLength() + 4) {
        return mN;
      }
    }
  }
}
