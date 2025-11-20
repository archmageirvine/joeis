package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081971 Consider the harmonic progression 1,1/2,1/3,1/4,1/5,..., group the terms such that the n-th group contains n members like this (1/1),(1/2,1/3),(1/4,1/5,1/6), (1/7,1/8,1/9,1/10),... a(n) = the numerator of the reduced rational sum of the terms of the n-th group.
 * @author Sean A. Irvine
 */
public class A081971 extends Sequence1 {

  private int mN = 0;
  private long mM = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(new Q(1, ++mM));
    }
    return select(sum);
  }
}
