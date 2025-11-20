package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081972 Consider the geometric progression 1,1/2,1/4,1/8,1/16,1/32,1/64,... Group the terms such that the n-th group contains n terms like this (1/1),(1/2,1/4),(1/8,1/16,1,32),(1/64,1/128,1/256,1/512),... a(n) = floor[1/s(n)] where s(n) is the sum of the members of the n-th group.
 * @author Sean A. Irvine
 */
public class A081972 extends Sequence1 {

  private int mN = 0;
  private long mM = -1;

  protected Z select(final Q n) {
    return n.reciprocal().floor();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(new Q(1, Z.ONE.shiftLeft(++mM)));
    }
    return select(sum);
  }
}
