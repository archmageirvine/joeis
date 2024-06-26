package irvine.oeis.a095;
// Generated by gen_seq4.pl valuation/valuat at 2022-03-17 22:13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a004.A004001;

/**
 * A095767 a(n) = valuation(A004001(n),2).
 * @author Georg Fischer
 */
public class A095767 extends A004001 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), Z.TWO);
  }
}
