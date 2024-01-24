package irvine.oeis.a068;

import irvine.oeis.FilterSequence;
import irvine.oeis.a067.A067030;

/**
 * A068062 Palindromes n of the form k + reverse(k) for at least one k.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A068062 extends FilterSequence {

  /** Construct the sequence. */
  public A068062() {
    super(1, new A067030(), PALINDROME);
  }
}
