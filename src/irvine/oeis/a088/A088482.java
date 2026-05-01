package irvine.oeis.a088;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A088482 a(n) = Sum_{k=1..4} floor(p(n,k) / p(n-1,k)) where p(n,k) = n! / (n-floor(n/2^k))!.
 * @author Sean A. Irvine
 */
public class A088482 extends Sequence2 {

  private long mN = 1;

  private Z p(final long k, final long n) {
    return Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(n - n / (1L << k)));
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, 4, k -> p(k, mN).divide(p(k, mN - 1)));
  }
}
