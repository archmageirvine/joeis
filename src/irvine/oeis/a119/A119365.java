package irvine.oeis.a119;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.oeis.LambdaSequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A119365 Generalized Catalan numbers for triangle A119335.
 * @author Georg Fischer
 */
public class A119365 extends LambdaSequence {

  private static final DirectArray A119335 = new A119335();

  /** Construct the sequence. */
  public A119365() {
    super(0, n -> A119335.a(2 * n, n).subtract(A119335.a(2 * n, n + 1)));
  }
}
