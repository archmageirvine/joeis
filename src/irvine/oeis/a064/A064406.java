package irvine.oeis.a064;

import irvine.oeis.PartialSumSequence;

/**
 * A064406 The accumulation of the number of even entries (A048967) over the number of odd entries (A001316) in row n of Pascal's triangle (A007318).
 * @author Sean A. Irvine
 */
public class A064406 extends PartialSumSequence {

  /** Construct the sequence. */
  public A064406() {
    super(1, new A064405());
  }
}

