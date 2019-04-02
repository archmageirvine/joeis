package irvine.oeis.a008;

import irvine.oeis.PartialSumSequence;

/**
 * A008577 Crystal ball sequence for planar net 4.8.8.
 * @author Sean A. Irvine
 */
public class A008577 extends PartialSumSequence {

  /** Construct the sequence. */
  public A008577() {
    super(new A008576());
  }
}

