package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024574 <code>a(n) =</code> sum of <code>[ 1/{k*e} ]</code> for k <code>= 1,2,...,n</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024574 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024574() {
    super(new A024573());
  }
}
