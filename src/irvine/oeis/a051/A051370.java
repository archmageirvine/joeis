package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051370 a(n+1) = a(n) + sum of digits of a(n)^2, with a(1) = 8.
 * @author Sean A. Irvine
 */
public class A051370 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.add(Functions.DIGIT_SUM.l(mA.square()));
    return mA;
  }
}

