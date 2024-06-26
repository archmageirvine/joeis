package irvine.oeis.a138;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a061.A061652;

/**
 * A138827 Sum of digits of n-th even superperfect number A061652(n).
 * @author Georg Fischer
 */
public class A138827 extends A061652 {
  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
