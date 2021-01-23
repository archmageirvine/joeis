package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024549 Sum of [ 1/{k*sqrt(3)} ], k = 1,2,...,n, where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024549 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024549() {
    super(new A024548());
  }
}
