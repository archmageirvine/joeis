package irvine.oeis.a266;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A266542 Number of n X 3 binary arrays with rows and columns lexicographically nondecreasing and row and column sums nonincreasing.
 * @author Georg Fischer
 */
public class A266542 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A266542() {
    super(1, "[0,2,-1,1,-3,2]", "[1,-2,1,-1,2,-1]");
  }
}
