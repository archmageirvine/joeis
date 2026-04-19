package irvine.oeis.a084;

import irvine.oeis.FilterSequence;

/**
 * A084467 Odd terms of A084457.
 * @author Sean A. Irvine
 */
public class A084467 extends FilterSequence {

  /** Construct the sequence. */
  public A084467() {
    super(1, new A084457(), ODD);
  }
}
