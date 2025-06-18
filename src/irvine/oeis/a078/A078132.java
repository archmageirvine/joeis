package irvine.oeis.a078;

import irvine.oeis.FilterSequence;

/**
 * A078132 Primes which can be written as sum of cubes &gt; 1.
 * @author Sean A. Irvine
 */
public class A078132 extends FilterSequence {

  /** Construct the sequence. */
  public A078132() {
    super(1, new A078131(), PRIME);
  }
}

