package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002805 Denominators of harmonic numbers H(n) = Sum_{i=1..n} 1/i.
 * @author Sean A. Irvine
 */
public class A002805 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mSum = mSum.add(new Q(2 * mN - 1, mN));
    return mSum.den();
  }
}

