package irvine.oeis.a050;

import irvine.oeis.InverseSequence;
import irvine.oeis.a122.A122821;

/**
 * A050237 a(n) = the smallest number m such that there are exactly n sets of consecutive primes, each of which has an arithmetic mean of m.
 * @author Sean A. Irvine
 */
public class A050237 extends InverseSequence {

  /** Construct the sequence. */
  public A050237() {
    super(0, new A122821(), 0);
  }
}
