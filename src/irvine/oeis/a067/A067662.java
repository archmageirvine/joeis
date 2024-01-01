package irvine.oeis.a067;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000068;

/**
 * A067662 Numbers n such that n^2 + 1 and n^4 + 1 are primes.
 * @author Sean A. Irvine
 */
public class A067662 extends FilterSequence {

  /** Construct the sequence. */
  public A067662() {
    super(1, new A000068(), k -> k.square().add(1).isProbablePrime());
  }
}
