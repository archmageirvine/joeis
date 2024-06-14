package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A070801 Largest prime &lt;= sigma(n): a(n) = prevprime(sigma(n)), where prevprime(n) = A007917(n), the largest prime less than or equal to n.
 * @author Sean A. Irvine
 */
public class A070801 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Functions.PREV_PRIME.z(Functions.SIGMA1.z(++mN).add(1));
  }
}
