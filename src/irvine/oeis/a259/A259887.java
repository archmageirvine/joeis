package irvine.oeis.a259;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A259887 Number of (n+2) X (1+2) 0..1 arrays with each 3 X 3 subblock having clockwise perimeter pattern 00000000 00000001 or 00000011.
 * @author Georg Fischer
 */
public class A259887 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A259887() {
    super(1, "[0,34,33,148,114]", "[1,-1,0,-5,-3]");
  }
}
