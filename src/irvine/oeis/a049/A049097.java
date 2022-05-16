package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049097 Primes p such that p+1 is squarefree.
 * @author Sean A. Irvine
 */
public class A049097 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Jaguar.factor(p.add(1)).isSquareFree()) {
        return p;
      }
    }
  }
}
