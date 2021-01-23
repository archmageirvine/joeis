package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026928 Number of partitions of n into an even number of parts, the greatest being 4; also, a(n+7) = number of partitions of n+3 into an odd number of parts, each &lt;=4.
 * @author Sean A. Irvine
 */
public class A026928 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mE.get(++mN, 4L);
  }
}
