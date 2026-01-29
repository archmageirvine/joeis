package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083463 a(n) = smallest number k such that 2^n + k is a palindrome.
 * @author Sean A. Irvine
 */
public class A083463 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return Functions.NEXT_PALINDROME.z(mA).subtract(mA);
  }
}
