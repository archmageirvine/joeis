package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026927 Number of partitions of n into an even number of parts, the greatest being 3; also, <code>a(n+5) =</code> number of partitions of <code>n+2</code> into an odd number of parts, each <code>&lt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A026927 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mE.get(++mN, 3L);
  }
}
