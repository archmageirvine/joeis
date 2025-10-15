package irvine.oeis.a073;

import irvine.oeis.InverseSequence;

/**
 * A073611 Smallest m such that there are n primes of the form m-p where p is a prime. Index of the first occurrence of n in A073610.
 * @author Sean A. Irvine
 */
public class A073611 extends InverseSequence {

  /** Construct the sequence. */
  public A073611() {
    super(0, 0, new A073610());
  }
}
