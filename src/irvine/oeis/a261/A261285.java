package irvine.oeis.a261;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A261285 Number of (n+2) X (1+2) 0..1 arrays with each 3 X 3 subblock having clockwise perimeter pattern 00000001 00010101 or 01010101.
 * @author Georg Fischer
 */
public class A261285 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A261285() {
    super(1, "[0,36,50,60,44,-33,-18,-116,106,-231,-78,-72,-36,28]", "[1,0,-1,-2,-4,0,-3,8,-9,6,4,4,4]");
  }
}
