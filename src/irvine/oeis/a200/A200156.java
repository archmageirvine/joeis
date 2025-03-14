package irvine.oeis.a200;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A200156 Number of 0..n arrays x(0..4) of 5 elements with zero 4th difference.
 * @author Georg Fischer
 */
public class A200156 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A200156() {
    super(1, "[0,2,13,23,48,57,67,60,48,26,11,1,0,-1,1]", "[1,-1,-1,0,-1,3,1,0,-1,-3,1,0,1,1,-1]");
  }
}
