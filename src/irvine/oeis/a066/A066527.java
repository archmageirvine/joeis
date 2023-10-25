package irvine.oeis.a066;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a007.A007504;

/**
 * A066527 Triangular numbers that for some k are also the sum of the first k primes.
 * @author Sean A. Irvine
 */
public class A066527 extends IntersectionSequence {

  /** Construct the sequence. */
  public A066527() {
    super(new A000217(), new A007504().skip());
  }
}
