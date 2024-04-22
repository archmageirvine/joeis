package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A062773 Index of the smallest prime which follows square of n-th prime.
 * @author Sean A. Irvine
 */
public class A062773 extends A062772 {

  @Override
  public Z next() {
    return Functions.PRIME_PI.z(super.next());
  }
}
