package irvine.oeis.a211;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A211270 Number of integer pairs (x,y) such that 0&lt;x&lt;=y&lt;=n and x*y=2n.
 * a(n) = floor((A000005(2n)-1)/2).
 * @author Georg Fischer
 */
public class A211270 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Cheetah.factor(mN << 1).sigma0().subtract(1).divide2();
  }
}
