package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006093;

/**
 * A008334 Number of distinct primes dividing p-1, where p = n-th prime.
 * @author Sean A. Irvine
 */
public class A008334 extends A006093 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}


