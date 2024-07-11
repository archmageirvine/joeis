package irvine.oeis.a071;

import irvine.oeis.FilterSequence;
import irvine.oeis.a066.A066492;

/**
 * A071272 Palindromes in A066492.
 * @author Sean A. Irvine
 */
public class A071272 extends FilterSequence {

  /** Construct the sequence. */
  public A071272() {
    super(1, new A066492(), PALINDROME);
  }
}
