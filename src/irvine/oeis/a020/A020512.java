package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020512 Cyclotomic polynomials at x=-13.
 * @author Sean A. Irvine
 */
public class A020512 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int n = ++mN;
    return Functions.CYCLOTOMIC.z(n, Z.valueOf(-13));
  }
}
