package irvine.oeis.a366;
// Generated by gen_seq4.pl robots/lingf at 2023-11-09 11:57

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A366506 a(n) = Lucas(n) + 3.
 * @author Georg Fischer
 */
public class A366506 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A366506() {
    super(1, "[0, 4,-2,-5]", "[1,-2, 0, 1]");
  }
}
