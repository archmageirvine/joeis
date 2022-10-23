package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A019324 Cyclotomic polynomials at x=6.
 * @author Sean A. Irvine
 */
public class A019324 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, 6);
  }
}

