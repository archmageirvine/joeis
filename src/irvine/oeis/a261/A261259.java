package irvine.oeis.a261;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A261259 Number of (n+2) X (2+2) 0..1 arrays with each 3 X 3 subblock having clockwise perimeter pattern 00010101 00100101 or 01010101.
 * @author Georg Fischer
 */
public class A261259 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A261259() {
    super(1, "[0,41,11,58,40,41,-14]", "[1,-1,0,-2,-1,-2]");
  }
}
