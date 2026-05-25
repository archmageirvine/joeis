package irvine.oeis.a084;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001358;

/**
 * A084997 Numbers which can be written as the sum as well as the product of 2 primes, not necessarily the same.
 * @author Sean A. Irvine
 */
public class A084997 extends FilterSequence {

  /** Construct the sequence. */
  public A084997() {
    super(1, new A001358(), k -> k.isEven() || k.subtract(2).isProbablePrime());
  }
}
