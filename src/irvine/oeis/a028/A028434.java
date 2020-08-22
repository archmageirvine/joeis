package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028434 Golc sequence in base 4. Left to right concatenation of n,int(log_4(n)),int(log_4(int(log_4(n)))),... in base 4.
 * @author Sean A. Irvine
 */
public class A028434 implements Sequence {

  private static final CR BASE_LOG = CR.FOUR.log();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.FOUR;
    }
    long m = mN;
    long pm = m;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      pm = m;
      sb.append(Long.toString(m, 4));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    if (pm > 1) {
      sb.append('0');
    }
    return new Z(sb, 4);
  }
}
