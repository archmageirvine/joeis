package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049282 Primes p such that both p-2 and p+2 are squarefree.
 * @author Sean A. Irvine
 */
public class A049282 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Cheetah.factor(p.add(2)).isSquareFree() && Cheetah.factor(p.subtract(2)).isSquareFree()) {
        return p;
      }
    }
  }
}
