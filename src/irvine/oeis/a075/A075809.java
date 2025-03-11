package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075809 Palindromic even numbers with an odd number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A075809 extends FilterSequence {

  /** Construct the sequence. */
  public A075809() {
    super(1, new A075800(), EVEN);
  }
}
