package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026598 a(n) = Sum_{i=0..n} Sum_{j=0..i} T(i,j), T given by A026584.
 * @author Sean A. Irvine
 */
public class A026598 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026598() {
    super(new A026596());
  }
}
