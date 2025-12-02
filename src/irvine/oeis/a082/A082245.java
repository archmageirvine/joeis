package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082245 Sum of (n-1)-th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A082245 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.valueOf(d).pow(mN - 1));
  }
}
