package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028428 Clog sequence in base 7. Right to left concatenation of <code>n,int(log_7(n)),int(log_7(int(log_7(n)))),..</code>. in <code>base7</code>.
 * @author Sean A. Irvine
 */
public class A028428 implements Sequence {

  private static final CR BASE_LOG = CR.valueOf(7).log();
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      sb.insert(0, Long.toString(m, 7));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    return new Z(sb, 7);
  }
}
