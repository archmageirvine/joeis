package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A008335 Number of distinct primes dividing p+1 as p runs through the primes.
 * @author Sean A. Irvine
 */
public class A008335 extends A008864 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}


