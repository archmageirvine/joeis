package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033298 a(n+1) = a(n) + sum of digits of a(n)^2.
 * @author Sean A. Irvine
 */
public class A033298 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Functions.DIGIT_SUM.l(mA.square()));
    return mA;
  }
}

