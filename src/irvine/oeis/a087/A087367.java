package irvine.oeis.a087;

import irvine.oeis.FilterSequence;
import irvine.oeis.a019.A019546;

/**
 * A087367 Twin primes whose digits are primes.
 * @author Sean A. Irvine
 */
public class A087367 extends FilterSequence {

  /** Construct the sequence. */
  public A087367() {
    super(1, new A019546(), p -> p.add(2).isProbablePrime());
  }
}
