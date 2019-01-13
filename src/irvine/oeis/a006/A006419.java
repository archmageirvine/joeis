package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006419.
 * @author Sean A. Irvine
 */
public class A006419 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN + 1).subtract(Binomial.binomial(2 * mN + 3, mN + 1)).add(Binomial.binomial(2 * mN + 1, mN));
  }
}
