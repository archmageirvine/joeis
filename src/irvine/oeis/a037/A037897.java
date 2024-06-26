package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037897 (Greatest base 3 digit of n)-(least base 3 digit of n).
 * @author Sean A. Irvine
 */
public class A037897 extends Sequence1 {

  private Z mN = Z.ZERO;

  protected int base() {
    return 3;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(Functions.DIGIT_SORT_ASCENDING.z(base(), mN).mod(base()) - Functions.DIGIT_SORT_DESCENDING.z(base(), mN).mod(base()));
  }
}
