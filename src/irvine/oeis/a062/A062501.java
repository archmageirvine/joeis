package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A062501 Number of distinct prime divisors of the nonprimes (including 1).
 * @author Sean A. Irvine
 */
public class A062501 extends A018252 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
