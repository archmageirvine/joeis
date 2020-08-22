package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026929 Number of partitions of n into an even number of parts, the greatest being 5; also, a(n+9) = number of partitions of n+4 into an odd number of parts, each &lt;=5.
 * @author Sean A. Irvine
 */
public class A026929 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mE.get(++mN, 5L);
  }
}
