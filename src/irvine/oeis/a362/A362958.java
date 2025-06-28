package irvine.oeis.a362;

import irvine.oeis.RecordSequence;
import irvine.oeis.a078.A078350;

/**
 * A362958 a(n) is the number of primes in a Collatz orbit started at A078373(n).
 * @author Sean A. Irvine
 */
public class A362958 extends RecordSequence {

  /** Construct the sequence. */
  public A362958() {
    super(1, new A078350().skip());
  }
}

