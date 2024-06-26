package irvine.oeis.a178;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a050.A050278;

/**
 * A178775 Smallest prime factors of zerofull restricted pandigital numbers.
 * @author Georg Fischer
 */
public class A178775 extends A050278 {
  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
