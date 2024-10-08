package irvine.oeis.a226;
// Generated by gen_seq4.pl 2024-09-29.ack/filnum at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A226327 Sum of digits of n equals sum of digits of its antisigma (A024816).
 * @author Georg Fischer
 */
public class A226327 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A226327() {
    super(1, 1, k -> Functions.DIGIT_SUM.z(k).equals(Functions.DIGIT_SUM.z(Functions.ANTISIGMA.z(k))));
  }
}
