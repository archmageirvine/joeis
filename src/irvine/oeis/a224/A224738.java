package irvine.oeis.a224;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A224738 Number of (n+1) X 2 0..1 matrices with each 2 X 2 permanent equal.
 * @author Georg Fischer
 */
public class A224738 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A224738() {
    super(1, "[0,16,-42,-5,49,-16]", "[1,-5,6,3,-7,2]");
  }
}
