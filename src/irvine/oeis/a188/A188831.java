package irvine.oeis.a188;
// manually dirtraf/dirtrali at 2024-02-06 20:25

import irvine.oeis.a073.A073497;
import irvine.oeis.FilterSequence;

/**
 * A188831 Primes of the form k^2 - prime(k).
 * @author Georg Fischer
 */
public class A188831 extends FilterSequence {

  /** Construct the sequence. */
  public A188831() {
    super(1, new A073497(), v -> v.isProbablePrime());
  }
}
