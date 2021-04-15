package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046645 a(n) = log_2(A046644(n)); also the 2-adic valuation of A046644(n).
 * @author Sean A. Irvine
 */
public class A046645 extends A046644 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength() - 1);
  }
}
