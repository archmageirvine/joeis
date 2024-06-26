package irvine.oeis.a337;
// Generated by gen_seq4.pl valuation/valuat at 2022-03-17 22:13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003602;

/**
 * A337821 For n &gt;= 0, a(4n+1) = 0, a(4n+3) = a(2n+1) + 1, a(2n+2) = a(n+1).
 * @author Georg Fischer
 */
public class A337821 extends A003602 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), Z.TWO);
  }
}
