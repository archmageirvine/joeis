package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026767 a(n) = Sum_{i=0..n} Sum_{j=0..n} T(i,j), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026767 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026767() {
    super(new A026765());
  }
}
