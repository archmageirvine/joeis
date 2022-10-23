package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003662 a(n) is smallest number != a(j)+a(k), j&lt;k.
 * @author Sean A. Irvine
 */
public class A003662 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long r = mN % 12;
      if (mN == 8 || r == 1 || r == 4 || r == 6 || r == 11) {
        return Z.valueOf(mN);
      }
    }
  }
}
