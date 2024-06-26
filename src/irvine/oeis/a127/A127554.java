package irvine.oeis.a127;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A127554 Sum of the digits of left factorial !n.
 * @author Georg Fischer
 */
public class A127554 extends A003422 {
  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
