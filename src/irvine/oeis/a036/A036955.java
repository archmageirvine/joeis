package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036955 Numbers whose base-4 representation is the decimal representation of a prime.
 * @author Sean A. Irvine
 */
public class A036955 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.TWO;
    }
    while (true) {
      mN += 2;
      if (new Z(Long.toString(mN, 4)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
