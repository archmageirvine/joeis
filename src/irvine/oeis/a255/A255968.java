package irvine.oeis.a255;
// Generated by gen_seq4.pl 2024-09-29.ack/filnum at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A255968 Numbers k such that antisigma(k) contains k as a substring.
 * @author Georg Fischer
 */
public class A255968 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A255968() {
    super(1, 1, k -> Functions.ANTISIGMA.z(k).toString().indexOf(Integer.toString(k)) >= 0);
  }
}
