package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002944;
import irvine.oeis.a003.A003418;

/**
 * A025538 <code>a(n) = (1/s(0) - 1/s(1) + ... + d/s(n))*lcm{C(0,0),C(1,0),...,C(n,0)}</code>, where d <code>= (-1)^n, s = A002944</code>, i.e., <code>s(k) =</code> LCM of row <code>k+1</code> of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A025538 extends A002944 {

  private Sequence mA = new A003418();
  private Q mSum = Q.ZERO;
  private boolean mSign = false;

  @Override
  public Z next() {
    mSign = !mSign;
    mSum = mSum.signedAdd(mSign, new Q(Z.ONE, super.next()));
    return mSum.multiply(mA.next()).toZ();
  }
}
