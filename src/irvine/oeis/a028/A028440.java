package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028440 Golc sequence in base 10. Left to right concatenation of n,int(log_10(n)),int(log_10(int(log_10(n)))),... in base 10.
 * @author Sean A. Irvine
 */
public class A028440 implements Sequence {

  private static final CR BASE_LOG = CR.TEN.log();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TEN;
    }
    long m = mN;
    long pm = m;
    final StringBuilder sb = new StringBuilder();
    while (m > 0) {
      pm = m;
      sb.append(m);
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    if (pm > 1) {
      sb.append('0');
    }
    return new Z(sb);
  }
}
