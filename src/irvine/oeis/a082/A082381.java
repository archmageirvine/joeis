package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082381 Sequence of the squared digital root of a number until 1 or 4 is reached. The initial numbers 1,2,..n are not output.
 * @author Sean A. Irvine
 */
public class A082381 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mA.isOne() || Z.FOUR.equals(mA)) {
      mA = Z.valueOf(++mN);
    }
    mA = Functions.DIGIT_SUM_SQUARES.z(mA);
    return mA;
  }
}
