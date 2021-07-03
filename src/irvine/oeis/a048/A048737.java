package irvine.oeis.a048;

import irvine.oeis.MultiplicativeClosureSequence;
import irvine.oeis.a000.A000043;

/**
 * A048737 Numbers whose prime divisors consist of primes p such that 2^p-1 is prime.
 * @author Sean A. Irvine
 */
public class A048737 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A048737() {
    super(new A000043());
  }
}
