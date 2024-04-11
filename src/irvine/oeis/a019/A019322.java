package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.math.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A019322 Cyclotomic polynomials at x=4.
 * @author Sean A. Irvine
 */
public class A019322 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, 4);
  }
}

