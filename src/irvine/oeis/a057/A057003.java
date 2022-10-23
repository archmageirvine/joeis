package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057003 Write the natural numbers in groups: 1; 2,3; 4,5,6; 7,8,9,10; ... and multiply the members of each group.
 * @author Sean A. Irvine
 */
public class A057003 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(++mM);
    }
    return prod;
  }
}
