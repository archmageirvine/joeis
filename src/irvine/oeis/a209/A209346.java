package irvine.oeis.a209;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A209346 Number of 5-bead necklaces labeled with numbers -n..n allowing reversal, with sum zero with no three beads in a row equal.
 * @author Georg Fischer
 */
public class A209346 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A209346() {
    super(1, "[0,5,30,60,85,63,28,4,1]", "[1,-2,-1,3,1,-1,-3,1,2,-1]");
  }
}
