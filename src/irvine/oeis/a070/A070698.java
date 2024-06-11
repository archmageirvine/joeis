package irvine.oeis.a070;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a004.A004086;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070698 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A070698() {
    super(1, new A004086().skip(), 1);
  }
}
