package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A038094 Number of rooted graphs on n labeled nodes where the root has degree 2.
 * @author Sean A. Irvine
 */
public class A038094 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    final Z t = Binomial.binomial(mN++, 2);
    return t.multiply(mN).shiftLeft(t.longValueExact());
  }
}
