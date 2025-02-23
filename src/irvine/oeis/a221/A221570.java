package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221570 Number of 0..5 arrays of length n with each element differing from at least one neighbor by something other than 1.
 * @author Georg Fischer
 */
public class A221570 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221570() {
    super(1, "[0,0,26,-16,28,12,12]", "[1,-5,-3,0,-9,-6,-3]");
  }
}
