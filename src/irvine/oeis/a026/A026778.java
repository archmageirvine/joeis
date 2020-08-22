package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026778 a(n) = Sum_{i=0..n} Sum_{j=0..n} T(i,j), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026778 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026778() {
    super(new A026776());
  }
}
