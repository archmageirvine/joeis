package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A075079 Numbers k in A001597 such that 2*k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A075079 extends FilterSequence {

  /** Construct the sequence. */
  public A075079() {
    super(1, new A001597(), k -> k.multiply2().add(1).isProbablePrime());
  }
}

