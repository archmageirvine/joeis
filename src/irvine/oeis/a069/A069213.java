package irvine.oeis.a069;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069211.
 * @author Sean A. Irvine
 */
public class A069213 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long cnt = 0;
    while (true) {
      if (LongUtils.gcd(mN, ++k) == 1 && ++cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

