package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075539 Perfect powers n such that (n-5)/2 is prime.
 * @author Sean A. Irvine
 */
public class A075539 extends FilterSequence {

  /** Construct the sequence. */
  public A075539() {
    super(1, new A075109(), k -> k.subtract(5).divide2().isProbablePrime());
  }
}

