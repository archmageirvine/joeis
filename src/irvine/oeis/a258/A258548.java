package irvine.oeis.a258;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A258548 Number of (n+1) X (2+1) 0..1 arrays with every 2 X 2 subblock ne-sw antidiagonal difference nondecreasing horizontally and nw+se diagonal sum nondecreasing vertically.
 * @author Georg Fischer
 */
public class A258548 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A258548() {
    super(1, "[0,44,-64,68,-16,-43,18,12,-12,-2,6,-1]", "[1,-4,5,-1,-3,4,-2,-2,3,-1]");
  }
}
