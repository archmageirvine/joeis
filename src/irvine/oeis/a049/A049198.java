package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A049198 Squarefull numbers whose Euler totient function is squarefree.
 * @author Sean A. Irvine
 */
public class A049198 extends A013929 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Cheetah.factor(Euler.phi(t)).isSquareFree()) {
        return t;
      }
    }
  }
}

