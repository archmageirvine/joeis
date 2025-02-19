package irvine.oeis.a159;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A159361 Number of n X n arrays of squares of integers with every (n-2)X(n-2) subblock summing to 5.
 * @author Georg Fischer
 */
public class A159361 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A159361() {
    super(4, "[0,0,0,0,68,3226,449370,6343952,19786496,15323450,1280218,-379900,14192,-304,80]", "[1,-11,55,-165,330,-462,462,-330,165,-55,11,-1]");
  }
}
