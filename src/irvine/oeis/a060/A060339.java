package irvine.oeis.a060;

import irvine.oeis.IntersectionSequence;

/**
 * A060339 Primes that are each the sum of two, three, and four consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A060339 extends IntersectionSequence {

  /** Construct the sequence. */
  public A060339() {
    super(new A060327(), new A060329());
  }
}
