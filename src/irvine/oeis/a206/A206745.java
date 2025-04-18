package irvine.oeis.a206;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A206745 Number of (n+1) X 2 0..3 arrays with every 2 X 3 or 3 X 2 subblock having an equal number of clockwise and counterclockwise edge increases.
 * @author Georg Fischer
 */
public class A206745 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A206745() {
    super(1, "[0,256,-1952,1440,4032,-4032]", "[1,-15,55,-17,-108,84]");
  }
}
