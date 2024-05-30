package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056188 a(1) = 1; for n&gt;1, sum of binomial(n,k) as k runs over RRS(n), the reduced residue system of n.
 * @author Georg Fischer
 */
public class A056188 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> Functions.GCD.l(mN, (long) k) == 1 ? Binomial.binomial(mN, k) : Z.ZERO);
  }
}
