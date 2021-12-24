package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026533 a(n) = Sum_{i=0..n} Sum_{j=0..i} T(i,j), T given by A026519.
 * @author Sean A. Irvine
 */
public class A026533 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026533() {
    super(new A026531());
  }
}
