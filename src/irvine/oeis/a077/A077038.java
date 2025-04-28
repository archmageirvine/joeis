package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A077038 Least difference of primes p, q such that p &lt; n^3 &lt; q.
 * @author Sean A. Irvine
 */
public class A077038 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z c = Z.valueOf(++mN).pow(3);
    return Functions.NEXT_PRIME.z(c).subtract(Functions.PREV_PRIME.z(c));
  }
}

