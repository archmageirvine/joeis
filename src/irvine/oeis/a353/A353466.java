package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-06-17/filnum at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A353466 Numbers k for which A276086(k) is of the form 4k+3.
 * @author Georg Fischer
 */
public class A353466 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A353466() {
    super(1, 0, k -> Functions.PRIMORIAL_BASE_EXP.z(k).mod(4) == 3);
  }
}
