package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A020507 Cyclotomic polynomials at x=-8.
 * @author Sean A. Irvine
 */
public class A020507 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, -8);
  }
}
