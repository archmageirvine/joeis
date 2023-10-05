package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028423 Clog sequence in base 2. Right to left concatenation of n,int(log_2(n)),int(log_2(int(log_2(n)))),... in base 2.
 * @author Sean A. Irvine
 */
public class A028423 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      sb.insert(0, Long.toBinaryString(m));
      m = LongUtils.log2(m);
    }
    return new Z(sb, 2);
  }
}
