package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A045986 Describe the n-th triangular number A000217(n).
 * @author Sean A. Irvine
 */
public class A045986 extends A000217 {

  @Override
  public Z next() {
    return new Z(Functions.LOOK_AND_SAY.z(new Z(super.next().toString())).toString());
  }
}
