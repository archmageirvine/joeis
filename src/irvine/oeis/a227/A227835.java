package irvine.oeis.a227;
// Generated by gen_seq4.pl valuation/valuat at 2022-03-17 22:13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000930;

/**
 * A227835 3^a(n) is the highest power of 3 dividing A000930(n).
 * @author Georg Fischer
 */
public class A227835 extends A000930 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), Z.THREE);
  }
}
