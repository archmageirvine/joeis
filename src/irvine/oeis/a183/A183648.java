package irvine.oeis.a183;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183648 Number of (n+1) X 6 0..4 arrays with every 2 X 2 subblock summing to 8.
 * @author Georg Fischer
 */
public class A183648 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A183648() {
    super(1, "[0,25405,-330950,1524203,-2897770,1875000]", "[1,-15,85,-225,274,-120]");
  }
}
