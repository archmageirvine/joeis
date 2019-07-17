package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024585 <code>a(n) =</code> sum of <code>[ 1/{k*pi} ]</code> for k <code>= 1,2,...,n</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024585 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024585() {
    super(new A024584());
  }
}
