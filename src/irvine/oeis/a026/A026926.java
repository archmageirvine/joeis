package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026926 Number of partitions of n into an odd number of parts, the greatest being 6; also, <code>a(n+11) =</code> number of partitions of <code>n+5</code> into an even number of parts, each <code>&lt;=6</code>.
 * @author Sean A. Irvine
 */
public class A026926 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mO.get(++mN, 6L);
  }
}
