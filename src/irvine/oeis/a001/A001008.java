package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001008 Numerators of harmonic numbers <code>H(n) = Sum_{i=1..n} 1/i</code>.
 * @author Sean A. Irvine
 */
public class A001008 implements Sequence {

  protected int mN = 0;
  private Q mH = Q.ZERO;

  @Override
  public Z next() {
    mH = mH.add(new Q(Z.ONE, Z.valueOf(++mN)));
    return mH.num();
  }
}
