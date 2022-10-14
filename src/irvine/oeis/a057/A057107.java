package irvine.oeis.a057;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000567;

/**
 * A057107 Octagonal palindromes.
 * @author Sean A. Irvine
 */
public class A057107 extends FilterSequence {

  /** Construct the sequence. */
  public A057107() {
    super(new A000567(), PALINDROME);
  }
}
