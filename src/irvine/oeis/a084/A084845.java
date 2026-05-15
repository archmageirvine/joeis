package irvine.oeis.a084;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084845 Numerators of the continued fraction n+1/(n+1/...) [n times].
 * @author Sean A. Irvine
 */
public class A084845 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Integers.SINGLETON.sum(0, mN / 2, k -> Binomial.binomial(mN - k, k).multiply(n.pow(mN - 2 * k)));
  }
}
