package irvine.oeis.a263;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A263746 Number of length n arrays of permutations of 0..n-1 with each element moved by -2 to 2 places and every three consecutive elements having its maximum within 5 of its minimum.
 * @author Georg Fischer
 */
public class A263746 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A263746() {
    super(1, "[0,1,1,2,2,1,5,-4,-6,-5,-2,3,1,2]", "[1,-1,-2,-2,0,3,-7,1,2,5,3,-2,0,-2]");
  }
}
