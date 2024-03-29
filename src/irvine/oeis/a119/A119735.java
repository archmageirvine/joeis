package irvine.oeis.a119;
// Generated by gen_seq4.pl 2024-03-26/filnum at 2024-03-26 23:22

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A119735 Numbers n such that every digit occurs at least once in n^3.
 * @author Georg Fischer
 */
public class A119735 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A119735() {
    super(1, 1, k -> ZUtils.distinctDigitCount(Z.valueOf(k).pow(3), 10) == 10);
  }
}
