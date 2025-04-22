package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076883 Let u(0)=1, u(n) = 5/2 * floor(u(n-1)); then a(n) = (2/5)*u(n).
 * @author Sean A. Irvine
 */
public class A076883 extends Sequence1 {

  private static final Q C1 = new Q(5, 2);
  private static final Q C2 = new Q(2, 5);
  private Q mU = Q.ONE;

  @Override
  public Z next() {
    mU = C1.multiply(mU.floor());
    return C2.multiply(mU).toZ();
  }
}
