package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A020504 Cyclotomic polynomials at x=-5.
 * @author Sean A. Irvine
 */
public class A020504 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, -5);
  }
}
