package irvine.oeis.a206;
// Generated by gen_seq4.pl diffspp at 2020-09-22 15:10
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A206917 Sum of binary palindromes in the half-open interval [2^(n-1), 2^n).
 * @author Georg Fischer
 */
public class A206917 extends PrependSequence {

  /** Construct the sequence. */
  public A206917() {
    super(new DifferenceSequence(new A206918()), 0);
  }
}
