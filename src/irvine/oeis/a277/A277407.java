package irvine.oeis.a277;
// Generated by gen_seq4.pl 2024-06-19/lambdan at 2024-06-19 23:57

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A277407 a(n) = A277406(n)/(n+1).
 * @author Georg Fischer
 */
public class A277407 extends LambdaSequence {

  private static final DirectSequence A277406 = new A277406();

  /** Construct the sequence. */
  public A277407() {
    super(0, n -> A277406.a(n).divide(n + 1));
  }
}
