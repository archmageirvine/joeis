package irvine.oeis.a264;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A264245 Number of (1+1) X (n+1) arrays of permutations of 0..n*2+1 with each element having directed index change 0,0 1,1 0,-1 -1,1 or 0,-2.
 * @author Georg Fischer
 */
public class A264245 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A264245() {
    super(1, "[0,2,4,3,-1,-1,-1]", "[1,-2,-1,-4,1,0,1]");
  }
}
