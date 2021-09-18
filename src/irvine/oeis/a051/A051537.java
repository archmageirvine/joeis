package irvine.oeis.a051;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051537 Triangle read by rows: T(i,j) = lcm(i,j)/gcd(i,j) for 1 &lt;= j &lt;= i.
 * @author Sean A. Irvine
 */
public class A051537 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(LongUtils.lcm(mN, mM) / LongUtils.gcd(mN, mM));
  }
}
