package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019331 Cyclotomic polynomials at x=13.
 * @author Sean A. Irvine
 */
public class A019331 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.valueOf(13) : Cyclotomic.cyclotomic(mN, 13);
  }
}

