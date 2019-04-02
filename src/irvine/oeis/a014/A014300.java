package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014300 Number of nodes of odd outdegree in all ordered rooted (planar) trees with n edges.
 * @author Sean A. Irvine
 */
public class A014300 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * k, mN));
    }
    return sum;
  }
}

