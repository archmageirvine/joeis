package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073466 Triangle T(j,k) = remainder when j-th triangular number is divided by k-th triangular number, for 2 &lt; j and 1 &lt; k &lt; j.
 * @author Sean A. Irvine
 */
public class A073466 extends Sequence0 {

  private int mN = 2;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 2;
    }
    return Functions.TRIANGULAR.z(mN).mod(Functions.TRIANGULAR.z(mM));
  }
}
