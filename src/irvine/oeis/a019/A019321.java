package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019321 Cyclotomic polynomials at <code>x=3</code>.
 * @author Sean A. Irvine
 */
public class A019321 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.THREE : Cyclotomic.cyclotomic(mN, 3);
  }
}

