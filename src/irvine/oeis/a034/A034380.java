package irvine.oeis.a034;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a002.A002322;

/**
 * A034380 Ratio of totient to Carmichael's lambda function: a(n) = A000010(n) / A002322(n).
 * @author Sean A. Irvine
 */
public class A034380 extends A002322 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Euler.phi(mN).divide(super.next());
  }
}
