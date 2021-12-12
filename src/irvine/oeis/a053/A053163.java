package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053163 n+cototient(n) produces these powers of 2 in order of magnitude.
 * @author Sean A. Irvine
 */
public class A053163 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long t = 2 * ++mN - LongUtils.phi(mN);
      if ((t & (t - 1)) == 0) {
        return Z.valueOf(t);
      }
    }
  }
}
