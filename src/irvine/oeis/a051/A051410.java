package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051410 a(n+1) = a(n) + sum of digits of a(n)^3.
 * @author Sean A. Irvine
 */
public class A051410 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.add(Functions.DIGIT_SUM.l(mA.pow(3)));
    return mA;
  }
}

