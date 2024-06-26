package irvine.oeis.a135;
// Generated by gen_seq4.pl 2024-05-29/lambdan at 2024-05-29 02:16

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A135020 Each natural number is followed by its reversal.
 * @author Georg Fischer
 */
public class A135020 extends LambdaSequence {

  /** Construct the sequence. */
  public A135020() {
    super(1, n -> (n & 1) == 1 ? Z.valueOf((n + 1) / 2) : Functions.REVERSE.z(10, n / 2));
  }
}
