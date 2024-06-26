package irvine.oeis.a076;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A076396 Smallest prime factor of n-th perfect power.
 * @author Georg Fischer
 */
public class A076396 extends A001597 {
  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
