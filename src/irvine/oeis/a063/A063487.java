package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a051.A051179;

/**
 * A063487 Number of distinct prime divisors of 2^(2^n)-1 (A051179).
 * @author Sean A. Irvine
 */
public class A063487 extends A051179 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
