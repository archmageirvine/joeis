package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008365 Smallest prime factor is &gt;= 13.
 * @author Sean A. Irvine
 */
public class A008365 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN % 3 != 0 && mN % 5 != 0 && mN % 7 != 0 && mN % 11 != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}


