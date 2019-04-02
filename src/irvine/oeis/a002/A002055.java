package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002055 Number of diagonal dissections of a convex n-gon into n-4 regions.
 * @author Sean A. Irvine
 */
public class A002055 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 4, mN).multiply(mN + 2).divide(2);
  }
}
