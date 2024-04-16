package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023589 a(n) is the number of distinct prime divisors of 2*prime(n)+1.
 * @author Sean A. Irvine
 */
public class A023589 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next().multiply2().add(1)));
  }
}
