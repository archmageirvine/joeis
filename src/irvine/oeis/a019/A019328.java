package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence1;

/**
 * A019328 Cyclotomic polynomials at x=10.
 * @author Sean A. Irvine
 */
public class A019328 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, 10);
  }
}

