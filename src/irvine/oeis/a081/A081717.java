package irvine.oeis.a081;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A081717 Primes prime(j) such that prime(j) + j is composite.
 * @author Sean A. Irvine
 */
public class A081717 extends FilterSequence {

  /** Construct the sequence. */
  public A081717() {
    super(1, new A000040(), (n, p) -> !p.add(n).isProbablePrime());
  }
}
