package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024554 <code>a(n) =</code> sum of <code>[ 1/{k*sqrt(5)} ], k = 1,2,...,n</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024554 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024554() {
    super(new A024553());
  }
}
