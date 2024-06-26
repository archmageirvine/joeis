package irvine.oeis.a361;
// Generated by gen_seq4.pl 2024-03-27/filter at 2024-03-27 21:37

import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007304;

/**
 * A361628 Sphenic numbers (products of 3 distinct primes) whose digits are primes.
 * @author Georg Fischer
 */
public class A361628 extends FilterSequence {

  /** Construct the sequence. */
  public A361628() {
    super(1, new A007304(), v -> v.toString(10).matches("[2357]+"));
  }
}
