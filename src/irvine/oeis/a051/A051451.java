package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A051451 a(n) = lcm{ 1,2,...,x } where x is the n-th prime power (A000961).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A051451 extends A000961 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.lcm(super.next());
    return mA;
  }
}
