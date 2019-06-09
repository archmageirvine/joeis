package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023645 <code>a(n) = tau(n)-1</code> if n is odd or <code>tau(n)-2</code> if n is even.
 * @author Sean A. Irvine
 */
public class A023645 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma0().subtract(2 - (mN & 1));
  }
}
