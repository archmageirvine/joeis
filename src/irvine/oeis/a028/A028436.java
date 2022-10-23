package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028436 Golc sequence in base 6. Left to right concatenation of n,int(log_6(n)),int(log_6(int(log_6(n)))),... in base6.
 * @author Sean A. Irvine
 */
public class A028436 extends Sequence1 {

  private static final CR BASE_LOG = CR.SIX.log();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.SIX;
    }
    long m = mN;
    long pm = m;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      pm = m;
      sb.append(Long.toString(m, 6));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    if (pm > 1) {
      sb.append('0');
    }
    return new Z(sb, 6);
  }
}
