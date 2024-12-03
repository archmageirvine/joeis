package irvine.oeis.a073;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073533 Let x(1)=1, x(n+1) = (4/3)*x(n) - floor((4/3)*x(n)); then a(n)=x(n)*3^n.
 * @author Sean A. Irvine
 */
public class A073533 extends Sequence1 {

  private static final Q CONST = new Q(4, 3);
  private Z mT = Z.ONE;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    final Q t = mA.multiply(CONST);
    mA = t.subtract(t.floor());
    mT = mT.multiply(3);
    return mA.multiply(mT).toZ();
  }
}
