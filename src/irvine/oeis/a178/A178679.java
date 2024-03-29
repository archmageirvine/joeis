package irvine.oeis.a178;
// Generated by gen_seq4.pl 2024-01-07/filamb at 2024-01-10 22:05

import irvine.oeis.FilterLambdaSequence;

/**
 * A178679 Numbers n such that the binary expansion of n starts with the base 3 expansion of n.
 * @author Georg Fischer
 */
public class A178679 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A178679() {
    super(1, 0, n -> n.toString(2).startsWith(n.toString(3)));
  }
}
