package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A083647 For primes p: Number of steps to reach 2 when iterating f(p) = greatest prime divisor of p-1.
 * @author Sean A. Irvine
 */
public class A083647 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long cnt = 0;
    while (!p.equals(Z.TWO)) {
      ++cnt;
      p = Functions.GPF.z(p.subtract(1));
    }
    return Z.valueOf(cnt);
  }
}
