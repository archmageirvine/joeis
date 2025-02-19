package irvine.oeis.a263;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A263812 Number of (n+1) X (2+1) arrays of permutations of 0..n*3+2 with each element having index change (+-,+-) 0,0 0,1 0,2 or 1,0.
 * @author Georg Fischer
 */
public class A263812 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A263812() {
    super(1, "[0,82,128,-61,-6]", "[1,-10,-23,10,1]");
  }
}
