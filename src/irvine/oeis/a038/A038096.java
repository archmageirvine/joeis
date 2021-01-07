package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038096 Number of rooted graphs on n labeled nodes where the root has degree 3.
 * @author Sean A. Irvine
 */
public class A038096 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return Binomial.binomial(mN++, 3).multiply(mN).shiftLeft(Binomial.binomial(mN - 1, 2).intValueExact());
  }
}
