package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065372 a(n) = A065371(A065371(n)).
 * @author Sean A. Irvine
 */
public class A065372 extends A065371 {

  private int mN = 0;

  @Override
  public Z next() {
    return a(a(++mN).intValueExact());
  }
}
