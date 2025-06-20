package irvine.oeis.a100;
// Generated by gen_seq4.pl 2024-03-22/filter at 2024-03-24 22:44

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000404;

/**
 * A100829 Numbers that are a sum of two nonzero squares and not divisible by 17.
 * @author Georg Fischer
 */
public class A100829 extends FilterSequence {

  /** Construct the sequence. */
  public A100829() {
    super(1, new A000404(), v -> v.mod(17) != 0);
  }
}
