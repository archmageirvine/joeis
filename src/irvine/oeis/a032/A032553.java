package irvine.oeis.a032;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032553 Arrange digits of cubes in ascending order.
 * @author Sean A. Irvine
 */
public class A032553 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.DIGIT_SORT_ASCENDING.z(mN.pow(3));
  }
}
