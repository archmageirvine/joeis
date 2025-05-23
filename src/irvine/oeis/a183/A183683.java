package irvine.oeis.a183;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183683 Number of (n+1) X 5 binary arrays with every 2 X 2 subblock nonsingular.
 * @author Georg Fischer
 */
public class A183683 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A183683() {
    super(1, "[0,48,208,208]", "[1,0,-13,-16]");
  }
}
