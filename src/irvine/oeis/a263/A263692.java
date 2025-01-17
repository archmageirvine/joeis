package irvine.oeis.a263;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A263692 Number of length n arrays of permutations of 0..n-1 with each element moved by -3 to 3 places and every three consecutive elements having its maximum within 3 of its minimum.
 * @author Georg Fischer
 */
public class A263692 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A263692() {
    super(1, "[0,1,1,3,17,-11,-20,6,-8,0,2,-4,-4]", "[1,-1,-1,1,-1]");
  }
}
