package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A049196 Squarefree numbers whose Euler totient function is also squarefree.
 * @author Sean A. Irvine
 */
public class A049196 extends A005117 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Jaguar.factor(Euler.phi(t)).isSquareFree()) {
        return t;
      }
    }
  }
}

