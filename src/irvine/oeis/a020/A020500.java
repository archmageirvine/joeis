package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020500 Cyclotomic polynomials at x=1.
 * @author Sean A. Irvine
 */
public class A020500 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(++mN, 1);
  }
}
