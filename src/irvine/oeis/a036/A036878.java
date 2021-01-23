package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A036878 Integers of the form p^(p-1), where p is prime.
 * @author Sean A. Irvine
 */
public class A036878 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.pow(p.subtract(1));
  }
}
