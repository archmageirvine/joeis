package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026928 Number of partitions of n into an even number of parts, the greatest being 4; also, <code>a(n+7) =</code> number of partitions of <code>n+3</code> into an odd number of parts, each <code>&lt;=4</code>.
 * @author Sean A. Irvine
 */
public class A026928 extends A026920 {

  private long mN = 0;

  @Override
  public Z next() {
    return mE.get(++mN, 4L);
  }
}
