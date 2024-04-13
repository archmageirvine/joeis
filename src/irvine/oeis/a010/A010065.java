package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010065 a(n+1) = a(n) + sum of digits in base 4 representation of a(n), with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A010065 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(Functions.DIGIT_SUM.l(4, mA));
    return mA;
  }
}

