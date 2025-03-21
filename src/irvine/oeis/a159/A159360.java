package irvine.oeis.a159;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A159360 Number of n X n arrays of squares of integers with every (n-1) X (n-1) subblock summing to 5.
 * @author Georg Fischer
 */
public class A159360 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A159360() {
    super(3, "[0,0,0,32,710,49694,483448,1209448,893758,135158,-18008,-1880,-16]", "[1,-11,55,-165,330,-462,462,-330,165,-55,11,-1]");
  }
}
