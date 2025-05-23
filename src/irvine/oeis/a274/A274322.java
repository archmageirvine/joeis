package irvine.oeis.a274;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A274322 Number of partitions of n^2 into at most five parts.
 * @author Georg Fischer
 */
public class A274322 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A274322() {
    super(0, "[1,-3,4,13,21,63,138,204,257,280,267,201,128,67,31,6,1,1]", "[1,-4,3,7,-10,-4,10,3,-10,0,10,-3,-10,4,10,-7,-3,4,-1]");
  }
}
