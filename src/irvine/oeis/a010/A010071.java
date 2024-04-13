package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010071 a(n+1) = a(n) + sum of digits in base 8 representation of a(n).
 * @author Sean A. Irvine
 */
public class A010071 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Functions.DIGIT_SUM.l(8, mA));
    return mA;
  }
}

