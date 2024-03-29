package irvine.oeis.a106;
// Generated by gen_seq4.pl 2024-03-19/filter at 2024-03-19 22:04

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A106124 Primes with maximal digit &gt; 7.
 * @author Georg Fischer
 */
public class A106124 extends FilterSequence {

  /** Construct the sequence. */
  public A106124() {
    super(1, new A000040(), p -> ZUtils.sortDigitsAscending(p).mod(10) > 7);
  }
}
