package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A049231 Primes p such that p - 2 is squarefree.
 * @author Sean A. Irvine
 */
public class A049231 extends A065091 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Cheetah.factor(p.subtract(2)).isSquareFree()) {
        return p;
      }
    }
  }
}
