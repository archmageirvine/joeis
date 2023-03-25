package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003663 a(n) is smallest number != a(j) + a(k), j &lt; k and a(1) = 1, a(2) = 6.
 * @author Sean A. Irvine
 */
public class A003663 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long r = mN % 9;
      if (mN == 12 || r == 1 || r == 6 || r == 8) {
        return Z.valueOf(mN);
      }
    }
  }
}
