package irvine.oeis.a001;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001008 a(n) = numerator of harmonic number H(n) = Sum_{i=1..n} 1/i.
 * @author Sean A. Irvine
 */
public class A001008 extends Sequence1 implements RationalSequence {

  protected int mN = 0;
  private Q mH = Q.ZERO;

  @Override
  public Q nextQ() {
    mH = mH.add(new Q(Z.ONE, ++mN));
    return mH;
  }

  @Override
  public Z next() {
    mH = nextQ();
    return mH.num();
  }
}
