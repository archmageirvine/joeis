package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019329 Cyclotomic polynomials at x=11.
 * @author Sean A. Irvine
 */
public class A019329 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.valueOf(11) : Cyclotomic.cyclotomic(mN, 11);
  }
}

