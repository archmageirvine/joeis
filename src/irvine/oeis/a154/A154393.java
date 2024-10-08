package irvine.oeis.a154;
// Generated by gen_seq4.pl 2024-09-21.ack/lambdan at 2024-09-21 22:07

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A154393 Empirically good sequence of increments for shell sort algorithm.
 * @author Georg Fischer
 */
public class A154393 extends LambdaSequence {

  /** Construct the sequence. */
  public A154393() {
    super(1, n -> CR.valueOf(Functions.FIBONACCI.z(n + 1)).pow(CR.FIVE.sqrt().add(1)).floor());
  }
}
