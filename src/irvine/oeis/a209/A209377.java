package irvine.oeis.a209;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A209377 1/4 the number of (n+1) X 4 0..2 arrays with every 2 X 2 subblock having distinct edge sums.
 * @author Georg Fischer
 */
public class A209377 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A209377() {
    super(1, "[0,16,34,-64,-116]", "[1,0,-8,0,12]");
  }
}
