package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A161792 If b(m) is the number of 1's in the binary representation of m, then the positive integer m is included if m = k^b(m), for some integer k.
 * @author Sean A. Irvine
 */
public class A161792 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int pop = mN.bitCount();
      if (pop == 1) {
        return mN;
      }
      mN.root(pop); // ses auxiliary
      if (mN.auxiliary() == 1) {
        return mN;
      }
    }
  }
}

