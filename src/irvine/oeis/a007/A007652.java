package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A007652 Final digit of prime(n).
 * @author Sean A. Irvine
 */
public class A007652 extends A000040 {

  @Override
  public Z next() {
    return super.next().mod(Z.TEN);
  }
}
