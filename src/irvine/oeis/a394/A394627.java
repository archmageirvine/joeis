package irvine.oeis.a394;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a133.A133420;

/**
 * A394627 Indices of records in A133420, the number of iterations to reach 1 under the 5x+1 map A133419.
 * @author Sean A. Irvine
 */
public class A394627 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A394627() {
    super(1, 1, new A133420());
  }
}
