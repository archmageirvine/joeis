package irvine.oeis.a034;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A034715 Dirichlet convolution of triangular numbers with themselves.
 * @author Sean A. Irvine
 */
public class A034715 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> A000217.triangular(d).multiply(A000217.triangular(mN / d)));
  }
}
