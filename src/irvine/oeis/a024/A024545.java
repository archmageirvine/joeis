package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024545 <code>a(n) =</code> sum of <code>[ 1/{k/sqrt(2)} ], k = 1,2,...,n</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024545 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024545() {
    super(new A024544());
  }
}
