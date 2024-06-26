package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-02/filnum at 2024-04-02 23:05

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A070276 Numbers n such that sum of digits of n equals the sum of digits of n^3.
 * @author Georg Fischer
 */
public class A070276 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A070276() {
    super(1, 0, k -> Functions.DIGIT_SUM.l(k) == Functions.DIGIT_SUM.l(Z.valueOf(k).pow(3)));
  }
}
