package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A056175 Number of nonunitary prime divisors of the central binomial coefficient C(n, floor(n/2)) (A001405).
 * @author Sean A. Irvine
 */
public class A056175 extends A056057 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
