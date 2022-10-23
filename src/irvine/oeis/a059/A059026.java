package irvine.oeis.a059;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059026 Table B(n,m) read by rows: B(n,m) = LCM(n,m)/n + LCM(n,m)/m - 1 for all 1&lt;=m&lt;=n.
 * @author Sean A. Irvine
 */
public class A059026 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final long lcm = LongUtils.lcm(mN, mM);
    return Z.valueOf(lcm / mN + lcm / mM - 1);
  }
}
