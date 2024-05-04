package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A062565 Squarefree parts of 3-smooth numbers.
 * @author Sean A. Irvine
 */
public class A062565 extends A003586 {

  @Override
  public Z next() {
    return Functions.CORE.z(super.next());
  }
}

