package irvine.oeis.a366;
// Generated by gen_seq4.pl 2024-06-13/filnum at 2024-06-14 00:04

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A366959 Numbers whose difference between the largest and smallest digits is equal to 2.
 * @author Georg Fischer
 */
public class A366959 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A366959() {
    super(1, 1, n -> Functions.DIGIT_SORT_ASCENDING.i(10, n) % 10 - Functions.DIGIT_SORT_DESCENDING.i(10, n) % 10 == 2);
  }
}
