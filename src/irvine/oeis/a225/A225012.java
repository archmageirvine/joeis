package irvine.oeis.a225;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A225012 Number of 5 X n 0..1 arrays with rows unimodal and columns nondecreasing.
 * @author Georg Fischer
 */
public class A225012 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A225012() {
    super(1, "[0,6,-30,95,-200,296,-314,239,-128,46,-10,1]", "[1,-11,55,-165,330,-462,462,-330,165,-55,11,-1]");
  }
}
