package irvine.oeis.a019;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019327 Cyclotomic polynomials at x=9.
 * @author Sean A. Irvine
 */
public class A019327 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(++mN, 9);
  }
}

