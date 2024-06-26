package irvine.oeis.a050;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A050493 a(n) = sum of binary digits of n-th triangular number.
 * @author Georg Fischer
 */
public class A050493 extends LambdaSequence {

  /** Construct the sequence. */
  public A050493() {
    super(0, n -> Functions.DIGIT_SUM.z(2, Functions.TRIANGULAR.z(n)));
  }
}
