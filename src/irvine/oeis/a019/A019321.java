package irvine.oeis.a019;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019321 Cyclotomic polynomials at x=3.
 * @author Sean A. Irvine
 */
public class A019321 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(++mN, 3);
  }
}

