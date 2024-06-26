package irvine.oeis.a167;
// Generated by gen_seq4.pl 2024-04-08/filnum at 2024-04-08 19:12

import irvine.oeis.FilterNumberSequence;

/**
 * A167996 Positive numbers n with property that first digit of 3*n = last digit of n.
 * @author Georg Fischer
 */
public class A167996 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A167996() {
    super(1, 1, k -> String.valueOf(k * 3).charAt(0) - '0' == k % 10);
  }
}
