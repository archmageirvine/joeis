package irvine.oeis.a147;

import irvine.oeis.PartialSumSequence;

/**
 * A147842 Sum of all balanced numbers less than <code>10^n</code>.
 * @author Sean A. Irvine
 */
public class A147842 extends PartialSumSequence {

  /** Construct the sequence. */
  public A147842() {
    super(new A147808());
  }
}
