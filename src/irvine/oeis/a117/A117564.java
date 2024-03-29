package irvine.oeis.a117;
// Generated by gen_seq4.pl 2024-01-07/filamb at 2024-01-10 22:05

import irvine.oeis.FilterLambdaSequence;

/**
 * A117564 Numbers with no 1's in base 3, 4 &amp; 10 expansions.
 * @author Georg Fischer
 */
public class A117564 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A117564() {
    super(1, 0, n -> n.toString(3).indexOf('1') < 0 && n.toString(4).indexOf('1') < 0 && n.toString(10).indexOf('1') < 0);
  }
}
