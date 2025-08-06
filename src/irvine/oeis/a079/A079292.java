package irvine.oeis.a079;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001359;

/**
 * A079292 Near twin primes of order 12: twin primes p,p+2 such that p+12 and p+14 are primes.
 * @author Sean A. Irvine
 */
public class A079292 extends FilterSequence {

  /** Construct the sequence. */
  public A079292() {
    super(1, new A001359(), p -> p.add(12).isProbablePrime() && p.add(14).isProbablePrime());
  }
}
