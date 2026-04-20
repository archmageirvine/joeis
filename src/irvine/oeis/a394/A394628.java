package irvine.oeis.a394;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a133.A133422;

/**
 * A394628 Indices of records in A133422, the number of iterations to reach 1 under the 7x+1 map A133421.
 * @author Sean A. Irvine
 */
public class A394628 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A394628() {
    super(1, 1, new A133422());
  }
}
