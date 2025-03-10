package irvine.oeis.a339;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A339117 Number of cycles in the grid graph P_5 X P_n.
 * @author Georg Fischer
 */
public class A339117 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A339117() {
    super(2, "[0,0,10,-42,149,-300,-393,693,230,-473,-72,202,84]", "[1,-15,72,-169,194,109,-552,371,241,-316,-34,120,6,-28]");
  }
}
