package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-27.ack/lingf at 2024-08-27 22:38

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A374702 Number of integer compositions of n whose leaders of maximal weakly decreasing runs sum to 3. Column k = 3 of A374748.
 * @author Georg Fischer
 */
public class A374702 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A374702() {
    super(0, "[0, 0, 0, 2, 1, 1]", "[1, -1, -1, 0, 1, 1, -1]");
  }
}
