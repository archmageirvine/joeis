package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053577.
 * @author Sean A. Irvine
 */
public class A053577 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long t = ++mN - LongUtils.phi(mN);
      if ((t & (t - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
