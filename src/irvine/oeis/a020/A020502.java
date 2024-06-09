package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020502 Cyclotomic polynomials at x=-3.
 * @author Sean A. Irvine
 */
public class A020502 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(++mN, -3);
  }
}
