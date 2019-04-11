package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161793 If b(n) is the number of 0's in the binary representation of <code>n,</code> then the positive integer n is included if <code>n =</code> k^b(n), for some k = integer.
 * @author Sean A. Irvine
 */
public class A161793 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return mN;
      }
      final int pop = mN.bitLength() - mN.bitCount();
      if (pop == 1) {
        return mN;
      } else if (pop > 0) {
        mN.root(pop); // ses auxiliary
        if (mN.auxiliary() == 1) {
          return mN;
        }
      }
    }
  }
}

