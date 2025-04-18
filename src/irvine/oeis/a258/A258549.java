package irvine.oeis.a258;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A258549 Number of (n+1) X (3+1) 0..1 arrays with every 2 X 2 subblock ne-sw antidiagonal difference nondecreasing horizontally and nw+se diagonal sum nondecreasing vertically.
 * @author Georg Fischer
 */
public class A258549 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A258549() {
    super(1, "[0,104,-206,382,-304,156,-68,-28,67,-129,103,-29]", "[1,-4,6,-4,0,4,-6,4,-1]");
  }
}
