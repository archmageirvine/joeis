package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034714 Dirichlet convolution of squares with themselves.
 * @author Sean A. Irvine
 */
public class A034714 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma0().multiply(mN).multiply(mN);
  }
}
