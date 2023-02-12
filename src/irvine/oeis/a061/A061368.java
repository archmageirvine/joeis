package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A061368 Lesser of twin primes (p, p+2) whose average p+1 is not squarefree.
 * @author Sean A. Irvine
 */
public class A061368 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Jaguar.factor(p.add(1)).isSquareFree()) {
        return p;
      }
    }
  }
}

