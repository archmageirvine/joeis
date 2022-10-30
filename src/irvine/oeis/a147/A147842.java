package irvine.oeis.a147;

import irvine.oeis.PartialSumSequence;

/**
 * A147842 Sum of all balanced numbers less than 10^n.
 * @author Sean A. Irvine
 */
public class A147842 extends PartialSumSequence {

  /** Construct the sequence. */
  public A147842() {
    super(1, new A147808());
  }
}
