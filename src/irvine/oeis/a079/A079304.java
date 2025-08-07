package irvine.oeis.a079;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001359;

/**
 * A079304 Near twin primes of order 18: twin primes (p, p+2) such that p+18 and p+20 are primes.
 * @author Sean A. Irvine
 */
public class A079304 extends FilterSequence {

  /** Construct the sequence. */
  public A079304() {
    super(1, new A001359(), p -> p.add(18).isProbablePrime() && p.add(20).isProbablePrime());
  }
}
