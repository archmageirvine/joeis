package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049092 Primes p such that p-1 is not squarefree.
 * @author Sean A. Irvine
 */
public class A049092 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Jaguar.factor(p.subtract(1)).isSquareFree()) {
        return p;
      }
    }
  }
}
