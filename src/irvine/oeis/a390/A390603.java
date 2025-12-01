package irvine.oeis.a390;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390603 Number of closed binary operations on n labeled elements satisfying (xy)z = xy identically.
 * @author Sean A. Irvine
 */
public class A390603 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Integers.SINGLETON.sum(1, mN, k -> Binomial.binomial(mN, k).multiply(Z.valueOf(k).pow((long) (mN - k) * mN)));
  }
}

