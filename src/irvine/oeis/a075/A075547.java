package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075547 Perfect powers n such that (n-13)/2 is prime.
 * @author Sean A. Irvine
 */
public class A075547 extends FilterSequence {

  /** Construct the sequence. */
  public A075547() {
    super(1, new A075109(), k -> k.subtract(13).divide2().isProbablePrime());
  }
}

