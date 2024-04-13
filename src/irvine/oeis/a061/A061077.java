package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061077 a(n) is the sum of the products of the digits of the first n odd numbers.
 * @author Sean A. Irvine
 */
public class A061077 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    mA = mA.add(Functions.DIGIT_PRODUCT.l(mN));
    return mA;
  }
}
