package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024565 Sum of <code>[ 1/{k*sqrt(7)} ]</code> for k <code>= 1,2,...,n</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024565 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024565() {
    super(new A024564());
  }
}
