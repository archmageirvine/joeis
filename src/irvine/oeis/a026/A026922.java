package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026922 Number of partitions of n into an odd number of parts, the greatest being 2; also, a(n+3) = number of partitions of n+1 into an even number of parts, each &lt;=2.
 * @author Sean A. Irvine
 */
public class A026922 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mO.get(++mN, 2L);
  }
}
