package irvine.oeis.a016;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016052 a(1) = 3; for n &gt;= 1, a(n+1) = a(n) + sum of its digits.
 * @author Sean A. Irvine
 */
public class A016052 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.add(Functions.DIGIT_SUM.l(mA));
    return mA;
  }
}
