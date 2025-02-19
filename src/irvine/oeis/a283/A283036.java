package irvine.oeis.a283;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A283036 Number of n X 2 0..1 arrays with no 1 equal to more than one of its horizontal and vertical neighbors, with the exception of exactly one element.
 * @author Georg Fischer
 */
public class A283036 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A283036() {
    super(1, "[0,0,4,0,-4]", "[1,-4,-2,12,11,-4,-6,0,1]");
  }
}
