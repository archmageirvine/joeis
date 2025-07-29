package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000079;

/**
 * A045987 Describe 2^n.
 * @author Sean A. Irvine
 */
public class A045987 extends A000079 {

  @Override
  public Z next() {
    return new Z(Functions.LOOK_AND_SAY.z(new Z(super.next().toString())).toString());
  }
}
