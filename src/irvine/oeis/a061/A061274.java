package irvine.oeis.a061;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a071.A071973;

/**
 * A061274 Number of primes between Pi^(n-1) and Pi^n.
 * @author Sean A. Irvine
 */
public class A061274 extends DifferenceSequence {

  /** Construct the sequence. */
  public A061274() {
    super(new A071973());
  }
}
