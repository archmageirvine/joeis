package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028437 Golc sequence in base 7. Left to right concatenation of n,int(log_7(n)),int(log_7(int(log_7(n)))),... in base7.
 * @author Sean A. Irvine
 */
public class A028437 extends Sequence1 {

  private static final CR BASE_LOG = CR.SEVEN.log();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.SEVEN;
    }
    long m = mN;
    long pm = m;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      pm = m;
      sb.append(Long.toString(m, 7));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    if (pm > 1) {
      sb.append('0');
    }
    return new Z(sb, 7);
  }
}
