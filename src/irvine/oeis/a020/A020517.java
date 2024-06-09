package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020517 9th cyclotomic polynomial evaluated at powers of 2.
 * @author Sean A. Irvine
 */
public class A020517 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    Z x = Z.ONE.shiftLeft(++mN);
    return Functions.CYCLOTOMIC.z(9, x);
  }
}
