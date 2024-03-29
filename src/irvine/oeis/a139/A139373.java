package irvine.oeis.a139;
// Generated by gen_seq4.pl 2024-03-08/filnum at 2024-03-10 23:05

import irvine.oeis.FilterNumberSequence;

/**
 * A139373 Let the binary expansion of n be n = Sum_{k} 2^{r_k}, let e(n) be the number of r_k's that are even, o(n) the number that are odd; sequence lists n such that e(n) &gt; o(n).
 * @author Georg Fischer
 */
public class A139373 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A139373() {
    super(1, 1, n -> Integer.bitCount(n & 0xAAAA) < Integer.bitCount(n & 0x5555));
  }
}
