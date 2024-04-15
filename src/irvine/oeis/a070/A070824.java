package irvine.oeis.a070;
// manually sigman0/sigma0 at 2023-02-28 21:57

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070824 Number of divisors of n which are &gt; 1 and &lt; n (nontrivial divisors).
 * @author Georg Fischer
 */
public class A070824 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ZERO : Functions.SIGMA0.z(mN).subtract(2);
  }
}
