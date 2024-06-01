package irvine.oeis.a070;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070039 Sum of the divisors of n that are &lt; sqrt(n).
 * @author Sean A. Irvine
 */
public class A070039 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> d * d < mN ? Z.valueOf(d) : Z.ZERO);
  }
}
