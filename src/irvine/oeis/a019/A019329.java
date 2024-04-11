package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.math.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A019329 Cyclotomic polynomials at x=11.
 * @author Sean A. Irvine
 */
public class A019329 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, 11);
  }
}

