package irvine.oeis.a200;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A200205 Number of -n..n arrays x(0..3) of 4 elements with zero sum and nonzero second and third differences.
 * @author Georg Fischer
 */
public class A200205 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A200205() {
    super(1, "[0,12,44,62,94,52,18,6]", "[1,-2,1,-2,4,-2,1,-2,1]");
  }
}
