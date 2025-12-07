package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082382 Table which contains in row n the track of n-&gt;A003132(n) until reaching 1 or 4.
 * @author Sean A. Irvine
 */
public class A082382 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;
  private boolean mFirst = false;

  @Override
  public Z next() {
    if (!mFirst && (mA.isOne() || Z.FOUR.equals(mA))) {
      mFirst = true;
      mA = Z.valueOf(++mN);
    } else {
      mFirst = false;
      mA = Functions.DIGIT_SUM_SQUARES.z(mA);
    }
    return mA;
  }
}
