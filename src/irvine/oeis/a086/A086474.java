package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086474 a(1) = 4 and then least composite such that every partial concatenation of 2 or more terms is a prime.
 * @author Sean A. Irvine
 */
public class A086474 extends Sequence1 {

  private String mS = "4";
  private Z mK = null;

  @Override
  public Z next() {
    if (mK == null) {
      mK = Z.FOUR;
      return Z.FOUR;
    }
    mK = mK.or(Z.ONE);
    while (true) {
      mK = mK.add(2);
      if (!mK.isProbablePrime() && new Z(mS + mK).isProbablePrime()) {
        mS = mS + mK;
        return mK;
      }
    }
  }
}

