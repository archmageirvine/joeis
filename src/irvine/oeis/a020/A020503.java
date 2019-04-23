package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A020503 Cyclotomic polynomials at <code>x=-4</code>.
 * @author Sean A. Irvine
 */
public class A020503 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, -4);
  }
}
