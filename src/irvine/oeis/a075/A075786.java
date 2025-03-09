package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A075767.
 * @author Sean A. Irvine
 */
public class A075786 extends FilterSequence {

  /** Construct the sequence. */
  public A075786() {
    super(new A001597(), PALINDROME);
  }
}
