package irvine.oeis.a243;
// Generated by gen_seq4.pl knest at 2023-03-02 20:46

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a031.A031877;

/**
 * A243097 Digit sums of the nontrivial reversal numbers (numbers which are integer multiples of their reversal), excluding palindromes and multiples of 10.
 * @author Georg Fischer
 */
public class A243097 extends A031877 {
  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
