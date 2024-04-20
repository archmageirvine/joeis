package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A024677 Smallest prime divisor of n-th terms of sequence A024675 (averages of two consecutive odd primes).
 * @author Sean A. Irvine
 */
public class A024677 extends A024675 {

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
