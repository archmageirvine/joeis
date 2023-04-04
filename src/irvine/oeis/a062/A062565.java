package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A062565 Squarefree parts of 3-smooth numbers.
 * @author Sean A. Irvine
 */
public class A062565 extends A003586 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).core();
  }
}

