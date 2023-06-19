package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064161 Least abundant number divisible by the n-th prime number.
 * @author Sean A. Irvine
 */
public class A064161 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z k = p;
    while (true) {
      k = k.add(p);
      if (Jaguar.factor(k).sigma().subtract(k).compareTo(k) > 0) {
        return k;
      }
    }
  }
}
