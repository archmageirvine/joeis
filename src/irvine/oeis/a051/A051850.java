package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051850 a(n) = A051849(n)/floor(log_2(n)+1).
 * @author Sean A. Irvine
 */
public class A051850 extends A051849 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

