package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026929 Number of partitions of n into an even number of parts, the greatest being 5; also, <code>a(n+9) =</code> number of partitions of <code>n+4</code> into an odd number of parts, each <code>&lt;=5</code>.
 * @author Sean A. Irvine
 */
public class A026929 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mE.get(++mN, 5L);
  }
}
