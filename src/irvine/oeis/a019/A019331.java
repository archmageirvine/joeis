package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.math.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A019331 Cyclotomic polynomials at x=13.
 * @author Sean A. Irvine
 */
public class A019331 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, 13);
  }
}

