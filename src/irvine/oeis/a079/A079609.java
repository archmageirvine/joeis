package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079609 a(n) = (b(p)-2)/p where b(k) denotes Bell numbers and p = prime(n).
 * @author Sean A. Irvine
 */
public class A079609 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.BELL.z(p).subtract(2).divide(p);
  }
}

