package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a005.A005187;

/**
 * A046161 a(n) = denominator of binomial(2n,n)/4^n.
 * @author Sean A. Irvine
 */
public class A046161 extends A005187 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact());
  }
}
