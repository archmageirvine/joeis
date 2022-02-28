package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056188 a(1) = 1; for n&gt;1, sum of binomial(n,k) as k runs over RRS(n), the reduced residue system of n.
 * @author Georg Fischer
 */
public class A056188 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> LongUtils.gcd(mN, k) == 1 ? Binomial.binomial(mN, k) : Z.ZERO);
  }
}
