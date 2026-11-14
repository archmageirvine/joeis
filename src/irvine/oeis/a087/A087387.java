package irvine.oeis.a087;

import irvine.oeis.FilterSequence;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A087387 extends FilterSequence {

  /** Construct the sequence. */
  public A087387() {
    super(1, new A087386(), PALINDROME);
  }
}

