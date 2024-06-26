package irvine.oeis.a244;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000722;

/**
 * A244060 Sum of digits of (2^n)!.
 * @author Georg Fischer
 */
public class A244060 extends A000722 {
  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
