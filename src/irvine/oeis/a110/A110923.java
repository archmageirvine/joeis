package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A110923 Final two digits of prime(n), with leading zero omitted.
 * @author Georg Fischer
 */
public class A110923 extends A000040 {

  private static final Z HUNDRED = Z.valueOf(100);

  @Override
  public Z next() {
    return super.next().mod(HUNDRED);
  }
}
