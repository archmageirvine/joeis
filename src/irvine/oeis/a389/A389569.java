package irvine.oeis.a389;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a034.A034058;

/**
 * A389569 Indices of records in A034058.
 * @author Sean A. Irvine
 */
public class A389569 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A389569() {
    super(1, new A034058(), 0);
  }
}
