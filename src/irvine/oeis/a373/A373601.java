package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-07-15/lambdan at 2024-07-15 19:12

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a079.A079978;

/**
 * A373601 a(n) = 1 if the sum of prime factors (with multiplicity) of A276086(n) is a multiple of 3, otherwise 0, where A276086 is the primorial base exp-function.
 * @author Georg Fischer
 */
public class A373601 extends LambdaSequence {

  private static final DirectSequence A079978 = new A079978();
  private static final DirectSequence A373600 = new A373600();

  /** Construct the sequence. */
  public A373601() {
    super(0, n -> A079978.a(A373600.a(n)));
  }
}
