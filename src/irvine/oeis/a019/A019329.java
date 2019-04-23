package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019329 Cyclotomic polynomials at <code>x=11</code>.
 * @author Sean A. Irvine
 */
public class A019329 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, 11);
  }
}

