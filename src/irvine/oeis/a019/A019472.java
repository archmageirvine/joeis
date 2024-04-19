package irvine.oeis.a019;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000670;

/**
 * A019472 Weak preference orderings of n alternatives, i.e., orderings that have indifference between at least two alternatives.
 * @author Sean A. Irvine
 */
public class A019472 extends A000670 {

  @Override
  public Z next() {
    return super.next().subtract(Functions.FACTORIAL.z(mN));
  }
}
