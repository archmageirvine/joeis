package irvine.oeis.a062;
// Generated by gen_seq4.pl sigma0 at 2023-02-28 13:16

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a046.A046882;

/**
 * A062961 Number of divisors of n!^n! (A046882).
 * @author Georg Fischer
 */
public class A062961 extends A046882 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
