package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079609 a(p) = (b(p)-2)/p where b(k) denotes the k-th Bell number and p runs through the prime numbers.
 * @author Sean A. Irvine
 */
public class A079609 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.BELL.z(p).subtract(2).divide(p);
  }
}

