package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077230.
 * @author Sean A. Irvine
 */
public class A077252 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.DIGIT_SUM_SQUARES.z(++mN).subtract(Functions.DIGIT_SUM.z(mN));
  }
}
