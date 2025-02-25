package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075548 Perfect powers n such that (n-17)/2 is prime.
 * @author Sean A. Irvine
 */
public class A075548 extends FilterSequence {

  /** Construct the sequence. */
  public A075548() {
    super(1, new A075109(), k -> k.subtract(17).divide2().isProbablePrime());
  }
}

