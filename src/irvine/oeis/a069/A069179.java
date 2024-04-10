package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a068.A068635;

/**
 * A069179 Least number X such that for each k in (0 to n-1), 2^k*X-1 and 2^k*X+1 are primes. That is, there are N twin primes, each the "double" of the previous.
 * @author Sean A. Irvine
 */
public class A069179 extends A068635 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

