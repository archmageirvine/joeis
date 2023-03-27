package irvine.oeis.a062;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a030.A030432;
import irvine.oeis.a045.A045713;

/**
 * A062334 Primes starting and ending with 7.
 * @author Sean A. Irvine
 */
public class A062334 extends IntersectionSequence {

  /** Construct the sequence. */
  public A062334() {
    super(0, new A045713(), new A030432());
  }
}
