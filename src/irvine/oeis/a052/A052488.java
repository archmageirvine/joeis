package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052488 a(n) = floor(n*H(n)) where H(n) is the n-th harmonic number, Sum_{k=1..n} 1/k (A001008/A002805).
 * @author Sean A. Irvine
 */
public class A052488 extends Sequence1 {

  private int mN = 0;
  private Q mH = Q.ZERO;

  @Override
  public Z next() {
    mH = mH.add(new Q(Z.ONE, ++mN));
    return mH.multiply(mN).toZ();
  }
}
