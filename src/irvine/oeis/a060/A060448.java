package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A060448.
 * @author Sean A. Irvine
 */
public class A060448 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long[] d, final long selector) {
    long u = 1;
    long v = 1;
    for (int k = 0; k < d.length; ++k) {
      if ((selector & (1L << k)) != 0) {
        u *= d[k];
      } else {
        v *= d[k];
      }
    }
    return v % u == 0;
  }

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    final Z[] d = Jaguar.factor(mN).divisorsSorted();
    final long[] div = ZUtils.toLong(d);
    for (long selector = 1; selector < 1L << d.length; selector += 2) {
      if (is(div, selector)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
