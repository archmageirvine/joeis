package irvine.oeis.a033;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033467 Partial sums of sequence <code>{1/(i^2+1): i=0..n}</code> (numerators).
 * @author Sean A. Irvine
 */
public class A033467 implements Sequence {

  private long mN = -1;
  private Q mSum = Q.ZERO;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(1, ++mN * mN + 1));
    return select(mSum);
  }
}

