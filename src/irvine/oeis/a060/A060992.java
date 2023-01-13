package irvine.oeis.a060;

import irvine.math.IntegerUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060992 a(n) = Sum_{gcd(i,j) | 0 &lt; i &lt;= j &lt; n and i+j = n}.
 * @author Sean A. Irvine
 */
public class A060992 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN / 2, k -> Z.valueOf(IntegerUtils.gcd(mN - k, k)));
  }
}
