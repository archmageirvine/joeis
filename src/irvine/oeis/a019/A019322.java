package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019322 Cyclotomic polynomials at <code>x=4</code>.
 * @author Sean A. Irvine
 */
public class A019322 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.FOUR : Cyclotomic.cyclotomic(mN, 4);
  }
}

