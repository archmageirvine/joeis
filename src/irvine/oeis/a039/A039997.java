package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039997 Number of distinct primes which occur as substrings of the digits of n.
 * @author Sean A. Irvine
 */
public class A039997 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PRIME_MEMORY.z(++mN);
  }
}

