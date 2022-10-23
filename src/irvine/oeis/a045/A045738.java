package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A045738 Number of branches in all noncrossing rooted trees on n nodes on a circle.
 * @author Sean A. Irvine
 */
public class A045738 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN - 3, mN - 2).subtract(Binomial.binomial(3 * mN - 6, mN - 3).multiply2());
  }
}
