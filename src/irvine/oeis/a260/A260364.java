package irvine.oeis.a260;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A260364 Number of (n+2) X (2+2) 0..1 arrays with each 3 X 3 subblock having clockwise perimeter pattern 00000001 00000011 or 00001111.
 * @author Georg Fischer
 */
public class A260364 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A260364() {
    super(1, "[0,78,127,264,183,-471,-686,-692,-443,393,559,428,268]", "[1,0,-1,-5,-5,4,6,10,7,-4,-5,-5,-3]");
  }
}
