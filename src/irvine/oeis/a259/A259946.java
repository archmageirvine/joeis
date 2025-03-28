package irvine.oeis.a259;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A259946 Number of (n+2) X (2+2) 0..1 arrays with each 3 X 3 subblock having clockwise perimeter pattern 00000000 00000001 or 00000101.
 * @author Georg Fischer
 */
public class A259946 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A259946() {
    super(1, "[0,60,50,89,9,-514,-66,34,-90,144,-12]", "[1,-2,-2,-1,-6,14,4,-2,4,-4]");
  }
}
