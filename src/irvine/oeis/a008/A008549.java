package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008549.
 * @author Sean A. Irvine
 */
public class A008549 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN).subtract(Binomial.binomial(2L * mN + 1, mN));
  }
}
