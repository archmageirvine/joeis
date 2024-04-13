package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061078 Sum of the products of the digits of the first n positive even numbers.
 * @author Sean A. Irvine
 */
public class A061078 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    mA = mA.add(Functions.DIGIT_PRODUCT.l(mN));
    return mA;
  }
}
