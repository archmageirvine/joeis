package irvine.oeis.a078;

import irvine.oeis.FilterSequence;

/**
 * A078138 Primes which can be written as sum of squares &gt; 1.
 * @author Sean A. Irvine
 */
public class A078138 extends FilterSequence {

  /** Construct the sequence. */
  public A078138() {
    super(1, new A078137(), PRIME);
  }
}

