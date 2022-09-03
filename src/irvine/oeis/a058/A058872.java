package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058872 Number of 2-colored labeled graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A058872 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN - 1, k -> Binomial.binomial(mN, k).shiftLeft(mN - k + k * (mN - k)));
  }
}
