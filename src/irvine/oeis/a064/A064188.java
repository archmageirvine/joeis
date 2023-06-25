package irvine.oeis.a064;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064188 a(n) = Sum_{k=0..floor(n/2)} binomial(n - k*(k-1)/2, k).
 * @author Sean A. Irvine
 */
public class A064188 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN / 2, k -> Binomial.binomial(mN - k * (k - 1L) / 2, k));
  }
}
