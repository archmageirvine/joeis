package irvine.oeis.a119;
// Generated by gen_seq4.pl 2024-04-01/filnum at 2024-04-01 22:42

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A119798 Numbers m such that m and 2*m have the same number of distinct digits in decimal representation.
 * @author Georg Fischer
 */
public class A119798 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A119798() {
    super(1, 0, k -> Functions.DISTINCT_DIGIT_COUNT.i(10, Z.valueOf(k)) == Functions.DISTINCT_DIGIT_COUNT.i(10, Z.valueOf(2L * k)));
  }
}
