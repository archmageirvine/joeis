package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026927 Number of partitions of n into an even number of parts, the greatest being 3; also, a(n+5) = number of partitions of n+2 into an odd number of parts, each &lt;= 3.
 * @author Sean A. Irvine
 */
public class A026927 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mE.get(++mN, 3L);
  }
}
