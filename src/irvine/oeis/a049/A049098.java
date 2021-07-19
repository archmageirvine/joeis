package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049098 Primes p such that p+1 is divisible by a square.
 * @author Sean A. Irvine
 */
public class A049098 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Cheetah.factor(p.add(1)).isSquareFree()) {
        return p;
      }
    }
  }
}
