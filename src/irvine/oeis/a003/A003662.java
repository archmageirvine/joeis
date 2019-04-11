package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003662 <code>a(n)</code> is smallest number <code>!= a(j)+a(k), j&lt;k</code>.
 * @author Sean A. Irvine
 */
public class A003662 implements Sequence {

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
