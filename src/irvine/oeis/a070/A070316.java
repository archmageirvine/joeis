package irvine.oeis.a070;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a053.A053000;

/**
 * A070316 Numbers n such that nextprime(n^2)-n^2 (n&gt;=1) sets a new record.
 * @author Sean A. Irvine
 */
public class A070316 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A070316() {
    super(1, new A053000().skip(), 1);
  }
}
