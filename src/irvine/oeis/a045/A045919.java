package irvine.oeis.a045;

import irvine.oeis.PartialSumSequence;

/**
 * A045919 Partial sum of Goldbach numbers A045917.
 * @author Sean A. Irvine
 */
public class A045919 extends PartialSumSequence {

  /** Construct the sequence. */
  public A045919() {
    super(1, new A045917());
  }
}
