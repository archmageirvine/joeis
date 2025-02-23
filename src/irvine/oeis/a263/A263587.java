package irvine.oeis.a263;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A263587 Number of (1+1) X (n+1) arrays of permutations of 0..n*2+1 filled by rows with each element moved a city block distance of 1 or 2, and rows and columns in increasing lexicographic order.
 * @author Georg Fischer
 */
public class A263587 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A263587() {
    super(1, "[0,1,2,-7,11,13,7,8,5,2]", "[1,-4,5,-2,0,2,-3,0,1]");
  }
}
