package irvine.oeis.a208;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208121 Number of 6 X n 0..1 arrays avoiding 0 0 0 and 0 1 0 horizontally and 0 0 1 and 0 1 1 vertically.
 * @author Georg Fischer
 */
public class A208121 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A208121() {
    super(1, "[0,16,144,-672,945,-4158,3159,1458,6561]", "[1,-7,21,-84,0,756,-1701,5103,-6561]");
  }
}
