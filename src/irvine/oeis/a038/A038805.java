package irvine.oeis.a038;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a033.A033874;

/**
 * A038805 Difference between last prime &lt; 10^n and 10^n is a record high.
 * @author Sean A. Irvine
 */
public class A038805 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A038805() {
    super(new A033874(), 1);
  }
}
