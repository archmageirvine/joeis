package irvine.oeis.a061;

import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005728;

/**
 * A061560 Lengths of Farey-series (A005728) which are not primes.
 * @author Sean A. Irvine
 */
public class A061560 extends FilterSequence {

  /** Construct the sequence. */
  public A061560() {
    super(1, new A005728(), NONPRIME);
  }
}
