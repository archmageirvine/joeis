package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006481 Euler characteristics of polytopes.
 * @author Sean A. Irvine
 */
public class A006481 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 2 * (mN / 4) + 1).add(1);
  }
}
