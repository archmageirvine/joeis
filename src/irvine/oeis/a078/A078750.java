package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078750 Least m not less than 2*n such that m + n = m OR n (logical 'or', bitwise).
 * @author Sean A. Irvine
 */
public class A078750 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = 2 * ++mN;
    while (true) {
      if (m + mN == (m | mN)) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}
