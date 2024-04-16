package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023568 Number of distinct prime divisors of prime(n)-3.
 * @author Sean A. Irvine
 */
public class A023568 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next().subtract(3).abs()));
  }
}
