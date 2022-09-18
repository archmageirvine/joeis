package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A059328 Table T(n,k) = T(n - 1,k) + T(n,k - 1) + T(n - 1,k)*T(n,k - 1) starting with T(0,0)=1, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A059328 extends A007318 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact()).subtract(1);
  }
}
