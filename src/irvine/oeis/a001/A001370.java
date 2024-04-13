package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001370 Sum of digits of 2^n.
 * @author Sean A. Irvine
 */
public class A001370 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return Z.valueOf(Functions.DIGIT_SUM.l(mN));
  }
}
