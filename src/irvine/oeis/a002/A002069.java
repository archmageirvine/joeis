package irvine.oeis.a002;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000326;

/**
 * A002069 Palindromic pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A002069 extends FilterSequence {

  /** Construct the sequence. */
  public A002069() {
    super(new A000326(), PALINDROME);
  }
}
