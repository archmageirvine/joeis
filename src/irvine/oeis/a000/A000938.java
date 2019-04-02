package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a045.A045996;

/**
 * A000938 Number of collinear point-triples in an n X n grid.
 * @author Sean A. Irvine
 */
public class A000938 extends A045996 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z s = super.next();
    return Binomial.binomial(mN * mN, 3).subtract(s);
  }
}
