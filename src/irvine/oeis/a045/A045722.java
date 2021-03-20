package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045722 Number of border edges in all noncrossing rooted trees on n nodes.
 * @author Sean A. Irvine
 */
public class A045722 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Binomial.binomial(3 * mN - 2, mN - 1).multiply(mN + 1).divide(mN);
  }
}
