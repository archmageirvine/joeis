package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019330 Cyclotomic polynomials at <code>x=12</code>.
 * @author Sean A. Irvine
 */
public class A019330 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, 12);
  }
}

