package irvine.oeis.a159;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A159229 1/16 the number of n X n arrays of squares of integers with every 2X2 subblock summing to 30.
 * @author Georg Fischer
 */
public class A159229 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A159229() {
    super(2, "[0,0,3,2,-22,-4]", "[1,-3,-6,24,-16]");
  }
}
