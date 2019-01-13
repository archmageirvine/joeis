package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161793.
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

