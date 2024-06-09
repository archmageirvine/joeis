package irvine.oeis.a019;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019323 Cyclotomic polynomials at x=5.
 * @author Sean A. Irvine
 */
public class A019323 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int n = ++mN;
    return Functions.CYCLOTOMIC.z(n, Z.valueOf(5));
  }
}

