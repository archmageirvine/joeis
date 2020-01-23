package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028439 Golc sequence in base 9. Left to right concatenation of <code>n,int(log_9(n)),int(log_9(int(log_9(n)))),..</code>. in <code>base9</code>.
 * @author Sean A. Irvine
 */
public class A028439 implements Sequence {

  private static final CR BASE_LOG = CR.valueOf(9).log();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.NINE;
    }
    long m = mN;
    long pm = m;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      pm = m;
      sb.append(Long.toString(m, 9));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    if (pm > 1) {
      sb.append('0');
    }
    return new Z(sb, 9);
  }
}
