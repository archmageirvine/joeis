package irvine.oeis.a053;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000396;

/**
 * A053813 Numbers which are an integral multiple of the sum of their proper divisors: prime and perfect numbers.
 * @author Sean A. Irvine
 */
public class A053813 extends UnionSequence {

  /** Construct the sequence. */
  public A053813() {
    super(new A000040(), new A000396());
  }
}

