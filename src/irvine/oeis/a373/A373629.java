package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-07-11/lingf at 2024-07-11 18:00

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A373629 a(n) = sum of all numbers whose binary expansion is n bits long, starts and ends with a 1 bit, and contains no 00 bit pairs.
 * @author Georg Fischer
 */
public class A373629 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A373629() {
    super(1, "[0, 1]", "[1, -3, -3, 6, 4]");
  }
}
