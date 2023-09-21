package irvine.oeis.a065;

import irvine.oeis.RecordSequence;
import irvine.oeis.a007.A007365;

/**
 * A065933 Successive maxima in sequence A007365.
 * @author Sean A. Irvine
 */
public class A065933 extends RecordSequence {

  /** Construct the sequence. */
  public A065933() {
    super(1, new A007365());
  }
}
