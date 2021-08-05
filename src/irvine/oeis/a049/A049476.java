package irvine.oeis.a049;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a346.A346778;

/**
 * A049476 Positions of records in A346778.
 * @author Sean A. Irvine
 */
public class A049476 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A049476() {
    super(new A346778(), 1);
  }
}
