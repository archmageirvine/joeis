package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045737 Number of nonroot branch nodes in all noncrossing rooted trees on n nodes on a circle.
 * @author Sean A. Irvine
 */
public class A045737 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN - 6, mN - 4).multiply(7 * mN - 7).divide(2 * mN - 1);
  }
}
