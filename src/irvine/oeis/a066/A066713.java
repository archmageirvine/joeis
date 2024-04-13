package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A066713 RATS(2^n): Reverse Add the digits of 2^n, Then Sort: a(n) = A036839(2^n).
 * @author Sean A. Irvine
 */
public class A066713 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.ONE.shiftLeft(++mN);
    return ZUtils.sortDigitsAscending(Functions.REVERSE.z(n).add(n));
  }
}
