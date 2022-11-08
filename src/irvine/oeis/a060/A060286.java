package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060286 2^(p-1)*(2^p-1) where p is a prime.
 * @author Sean A. Irvine
 */
public class A060286 extends A000040 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    return Z.ONE.shiftLeft(p).subtract(1).shiftLeft(p - 1);
  }
}
