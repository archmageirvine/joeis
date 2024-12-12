package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073637 extends A000040 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM_ROOT.z(super.next().pow(3));
  }
}
