package irvine.oeis.a085;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000408;

/**
 * A085317 Primes which are the sum of three nonzero squares.
 * @author Sean A. Irvine
 */
public class A085317 extends FilterSequence {

  /** Construct the sequence. */
  public A085317() {
    super(1, new A000408(), PRIME);
  }
}
