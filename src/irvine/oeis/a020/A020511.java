package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A020511 Cyclotomic polynomials at x=-12.
 * @author Sean A. Irvine
 */
public class A020511 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, -12);
  }
}
