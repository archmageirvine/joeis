package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033936 a(n+1) = a(n) + sum of squares of digits of a(n).
 * @author Sean A. Irvine
 */
public class A033936 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Functions.DIGIT_SUM_SQUARES.l(mA));
    return mA;
  }
}
