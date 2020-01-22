package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028432.
 * @author Sean A. Irvine
 */
public class A028432 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    long m = mN;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      sb.append(Long.toBinaryString(m));
      m = LongUtils.lg(m);
    }
    return new Z(sb, 2);
  }
}
