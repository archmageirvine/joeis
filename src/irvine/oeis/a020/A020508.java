package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020508 Cyclotomic polynomials at x=-9.
 * @author Sean A. Irvine
 */
public class A020508 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int n = ++mN;
    return Functions.CYCLOTOMIC.z(n, Z.valueOf(-9));
  }
}
