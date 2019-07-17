package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024560 <code>a(n) =</code> sum of <code>[ 1/{k*sqrt(6)} ]</code> for k <code>= 1,2,...,n</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024560 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024560() {
    super(new A024559());
  }
}
