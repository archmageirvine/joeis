package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001008 Numerators of harmonic numbers H(n) = Sum_{i=1..n} 1/i.
 * @author Sean A. Irvine
 */
public class A001008 extends Sequence1 {

  protected int mN = 0;
  private Q mH = Q.ZERO;

  @Override
  public Z next() {
    mH = mH.add(new Q(Z.ONE, ++mN));
    return mH.num();
  }
}
