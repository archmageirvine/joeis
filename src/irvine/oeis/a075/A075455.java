package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075455 Prime averages of two successive perfect powers (A001597(k) + A001597(k+1))/2.
 * @author Sean A. Irvine
 */
public class A075455 extends FilterSequence {

  /** Construct the sequence. */
  public A075455() {
    super(new A075454(), PRIME);
  }
}
