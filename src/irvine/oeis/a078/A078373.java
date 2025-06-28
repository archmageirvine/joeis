package irvine.oeis.a078;

import irvine.oeis.RecordPositionSequence;

/**
 * A078373 n sets a record for the number of primes in {n, f(n), f(f(n)), ..., 1}, where f is the Collatz function defined by f(x) = x/2 if x is even; f(x) = 3x + 1 if x is odd.
 * @author Sean A. Irvine
 */
public class A078373 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A078373() {
    super(1, new A078350().skip(), 2);
  }
}

