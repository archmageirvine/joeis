package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003663 <code>a(n)</code> is smallest number <code>!=</code> a(j)+a(k), j&lt;k.
 * @author Sean A. Irvine
 */
public class A003663 implements Sequence {

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
