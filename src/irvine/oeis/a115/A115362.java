package irvine.oeis.a115;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A115362 Row sums of ((1,x) + (x,x^2))^(-1)*((1,x)-(x,x^2))^(-1) (using Riordan array notation).
 * a(n) is 1 + the 4-adic valuation of n+1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A115362 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.VALUATION.z(++mN, Z.FOUR).add(1);
  }
}
