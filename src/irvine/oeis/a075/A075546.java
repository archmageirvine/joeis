package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075546 Perfect powers n such that (n-9)/2 is prime.
 * @author Sean A. Irvine
 */
public class A075546 extends FilterSequence {

  /** Construct the sequence. */
  public A075546() {
    super(1, new A075109(), k -> k.subtract(9).divide2().isProbablePrime());
  }
}

