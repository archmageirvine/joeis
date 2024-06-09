package irvine.oeis.a019;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019328 Cyclotomic polynomials at x=10.
 * @author Sean A. Irvine
 */
public class A019328 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(++mN, 10);
  }
}

