package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014185 Volume of (the dilation by 2) of the Relaxed Boolean Quadric polytope of order n.
 * @author Sean A. Irvine
 */
public class A014185 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(Binomial.binomial(mN + 1, 2))
      .multiply(Functions.FACTORIAL.z(mN))
      .shiftLeft(2L * mN)
      .divide(Functions.FACTORIAL.z(2 * mN));
  }
}
