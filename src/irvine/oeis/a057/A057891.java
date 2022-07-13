package irvine.oeis.a057;

import irvine.oeis.ComplementSequence;

/**
 * A057891 In base 2, neither a palindrome nor becomes a palindrome if trailing 0's are omitted.
 * @author Sean A. Irvine
 */
public class A057891 extends ComplementSequence {

  /** Construct the sequence. */
  public A057891() {
    super(new A057890());
  }
}

