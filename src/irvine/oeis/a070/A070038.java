package irvine.oeis.a070;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070038 a(n) = sum of divisors of n that are at least sqrt(n).
 * @author Georg Fischer
 */
public class A070038 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> d * d >= mN ? Z.valueOf(d) : Z.ZERO);
  }
}
