package irvine.oeis.a067;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001008;

/**
 * A067657 Prime values of A001008, the numerators of the harmonic numbers.
 * @author Sean A. Irvine
 */
public class A067657 extends FilterSequence {

  /** Construct the sequence. */
  public A067657() {
    super(1, new A001008(), PRIME);
  }
}
