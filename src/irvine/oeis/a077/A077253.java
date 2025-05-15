package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077253 Sum of digits squared plus sum of digits of n.
 * @author Sean A. Irvine
 */
public class A077253 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.DIGIT_SUM_SQUARES.z(++mN).add(Functions.DIGIT_SUM.z(mN));
  }
}
