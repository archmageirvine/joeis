package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a126.A126084;

/**
 * A395766 Indices k such that the cumulative bitwise XOR of the first k primes is prime.
 * @author Sean A. Irvine
 */
public class A395766 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395766() {
    super(1, 0, new A126084(), PRIME);
  }
}
