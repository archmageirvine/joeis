package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A045988 Describe the n-th Fibonacci number A000045(n).
 * @author Sean A. Irvine
 */
public class A045988 extends A000045 {

  @Override
  public Z next() {
    return new Z(Functions.LOOK_AND_SAY.z(new Z(super.next().toString())).toString());
  }
}
