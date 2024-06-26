package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-06-17/filnum at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A351228 Numbers k for which A003415(k) &gt;= A276086(k), where A003415 is the arithmetic derivative and A276086 is the primorial base exp-function.
 * @author Georg Fischer
 */
public class A351228 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A351228() {
    super(1, 0, k -> Functions.ARD.z(k).compareTo(Functions.PRIMORIAL_BASE_EXP.z(k)) >= 0);
  }
}
