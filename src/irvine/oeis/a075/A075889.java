package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075773.
 * @author Sean A. Irvine
 */
public class A075889 extends FilterSequence {

  /** Construct the sequence. */
  public A075889() {
    super(1, new A075888(), PRIME);
  }
}
