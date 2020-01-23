package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028423 Clog sequence in base 2. Right to left concatenation of <code>n,int(log_2(n)),int(log_2(int(log_2(n)))),..</code>. in base 2.
 * @author Sean A. Irvine
 */
public class A028423 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      sb.insert(0, Long.toBinaryString(m));
      m = LongUtils.lg(m);
    }
    return new Z(sb, 2);
  }
}
