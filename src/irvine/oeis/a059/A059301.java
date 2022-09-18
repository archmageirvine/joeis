package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059301 Number of filter bases of an n-set.
 * @author Sean A. Irvine
 */
public class A059301 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN - 1, k -> Binomial.binomial(mN, k).shiftLeft((1 << k) - 1));
  }
}
