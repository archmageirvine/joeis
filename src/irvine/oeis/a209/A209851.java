package irvine.oeis.a209;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A209851 1/4 the number of (n+1) X 2 0..3 arrays with every 2 X 2 subblock having one or four distinct clockwise edge differences.
 * @author Georg Fischer
 */
public class A209851 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A209851() {
    super(1, "[0,25,82,-145,-355,295,-32]", "[1,-4,-29,28,110,-82,8]");
  }
}
