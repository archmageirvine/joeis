package irvine.oeis.a019;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019330 Cyclotomic polynomials at x=12.
 * @author Sean A. Irvine
 */
public class A019330 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int n = ++mN;
    return Functions.CYCLOTOMIC.z(n, Z.valueOf(12));
  }
}

