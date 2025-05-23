package irvine.oeis.a266;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A266465 Number of n X 3 binary arrays with rows and columns lexicographically nondecreasing and column sums nonincreasing.
 * @author Georg Fischer
 */
public class A266465 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A266465() {
    super(1, "[0,2,-5,3,7,-5,-1,-3,7,0,-7,5,-1]", "[1,-5,8,-1,-9,6,0,6,-9,-1,8,-5,1]");
  }
}
