package irvine.oeis.a263;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A263582 Number of (n+1)X(1+1) arrays of permutations of 0..n*2+1 filled by rows with each element moved a city block distance of 1 or 2, and rows and columns in increasing lexicographic order.
 * @author Georg Fischer
 */
public class A263582 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A263582() {
    super(1, "[0,1,0,2,-4]", "[1,-4,0,-2,-4,8]");
  }
}
