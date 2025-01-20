package irvine.oeis.a074;

import irvine.oeis.FilterSequence;
import irvine.oeis.a033.A033844;

/**
 * A074327 Smaller of twin primes arising in A074326.
 * @author Sean A. Irvine
 */
public class A074327 extends FilterSequence {

  /** Construct the sequence. */
  public A074327() {
    super(1, new A033844(), n -> n.add(2).isProbablePrime());
  }
}
