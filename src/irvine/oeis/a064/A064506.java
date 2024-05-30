package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064506 a(n) = Max { k | k*(k+1)/2 &lt;= n*(n+1)/2 - k*(k+1)/2 }.
 * @author Sean A. Irvine
 */
public class A064506 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long n = 2 * ++mN * (mN + 1) + 1;
    return Z.valueOf((Functions.SQRT.l(n) - 1) / 2);
  }
}
