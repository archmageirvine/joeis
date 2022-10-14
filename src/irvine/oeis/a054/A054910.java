package irvine.oeis.a054;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000566;

/**
 * A054910 Palindromic heptagonal numbers.
 * @author Sean A. Irvine
 */
public class A054910 extends FilterSequence {

  /** Construct the sequence. */
  public A054910() {
    super(new A000566(), PALINDROME);
  }
}
