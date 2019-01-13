package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013981.
 * @author Sean A. Irvine
 */
public class A013981 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * mN + 2, mN + 1).subtract(Z.ONE.shiftLeft(mN + 2)).add(mN + 3);
  }
}
