package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034714 Dirichlet convolution of squares with themselves.
 * @author Sean A. Irvine
 */
public class A034714 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA0.z(++mN).multiply(mN).multiply(mN);
  }
}
