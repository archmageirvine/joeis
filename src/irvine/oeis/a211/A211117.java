package irvine.oeis.a211;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A211117 Number of (n+1) X (n+1) -2..2 symmetric matrices with every 2 X 2 subblock having sum zero and two, three or four distinct values.
 * @author Georg Fischer
 */
public class A211117 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A211117() {
    super(1, "[0,12,-42,24,36,-16,-10]", "[1,-6,11,-3,-8,3,2]");
  }
}
