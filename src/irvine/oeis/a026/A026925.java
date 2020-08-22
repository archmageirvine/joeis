package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026925 Number of partitions of n into an odd number of parts, the greatest being 5; also, a(n+9) = number of partitions of n+4 into an even number of parts, each &lt;=5.
 * @author Sean A. Irvine
 */
public class A026925 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mO.get(++mN, 5L);
  }
}
