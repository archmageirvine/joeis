package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026930 Number of partitions of n into an even number of parts, the greatest being 6; also, a(n+11) = number of partitions of n+5 into an odd number of parts, each &lt;=6.
 * @author Sean A. Irvine
 */
public class A026930 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mE.get(++mN, 6L);
  }
}
