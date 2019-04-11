package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019325 Cyclotomic polynomials at <code>x=7</code>.
 * @author Sean A. Irvine
 */
public class A019325 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.SEVEN : Cyclotomic.cyclotomic(mN, 7);
  }
}

