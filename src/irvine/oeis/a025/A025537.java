package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002944;
import irvine.oeis.a003.A003418;

/**
 * A025537 <code>(1/s(0) + 1/s(1) + ... + 1/s(n))*lcm{C(0,0), C(1,0)</code>, ..., <code>C(n,0)}</code>, where s <code>= A002944</code>, i.e., <code>s(k) =</code> LCM of row <code>k+1</code> of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A025537 extends A002944 {

  private Sequence mA = new A003418();
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return mSum.multiply(mA.next()).toZ();
  }
}
