package irvine.oeis.a007;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a025.A025426;

/**
 * A007511.
 * @author Sean A. Irvine
 */
public class A007511 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A007511() {
    super(new A025426(), 0);
    next();
  }
}
