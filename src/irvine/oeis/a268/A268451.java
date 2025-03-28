package irvine.oeis.a268;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A268451 Number of length-n 0..2 arrays with no adjacent pair x,x+1 followed at any distance by x+1,x.
 * @author Georg Fischer
 */
public class A268451 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A268451() {
    super(1, "[0,3,-9,10,-8,3,-1]", "[1,-6,13,-14,10,-4,1]");
  }
}
