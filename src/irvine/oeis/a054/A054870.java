package irvine.oeis.a054;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a002.A002211;

/**
 * A054870 Positions of the incrementally largest terms in the continued fraction for Khinchin's constant.
 * @author Sean A. Irvine
 */
public class A054870 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A054870() {
    super(1, new A002211(), 1);
  }
}
