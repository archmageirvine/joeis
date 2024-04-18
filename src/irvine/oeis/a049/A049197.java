package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A049197 Squarefree numbers whose Euler totient function is not squarefree.
 * @author Sean A. Irvine
 */
public class A049197 extends A005117 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Jaguar.factor(Functions.PHI.z(t)).isSquareFree()) {
        return t;
      }
    }
  }
}

