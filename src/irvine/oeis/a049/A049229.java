package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049229 Primes p such that p-2 is not squarefree.
 * @author Sean A. Irvine
 */
public class A049229 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Cheetah.factor(p.subtract(2)).isSquareFree()) {
        return p;
      }
    }
  }
}
