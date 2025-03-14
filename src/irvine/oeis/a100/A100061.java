package irvine.oeis.a100;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A100061 Numerator of the probability that an integer n occurs in the cumulative sums of the decimal digits of a random real number between 0 and 1.
 * @author Georg Fischer
 */
public class A100061 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A100061() {
    super(1, "[0,1,9,81,729,6561,59049,531441,4782969,43046721]", "[1,-1,-9,-81,-729,-6561,-59049,-531441,-4782969,-43046721]");
  }
}
