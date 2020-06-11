package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028427 Clog sequence in base 6. Right to left concatenation of <code>n,int(log_6(n)),int(log_6(int(log_6(n)))),..</code>. in <code>base6</code>.
 * @author Sean A. Irvine
 */
public class A028427 implements Sequence {

  private static final CR BASE_LOG = CR.SIX.log();
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      sb.insert(0, Long.toString(m, 6));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    return new Z(sb, 6);
  }
}
