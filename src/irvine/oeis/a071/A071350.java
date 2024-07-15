package irvine.oeis.a071;

import irvine.oeis.RecordSequence;
import irvine.oeis.a058.A058250;

/**
 * A068017.
 * @author Sean A. Irvine
 */
public class A071350 extends RecordSequence {

  /** Construct the sequence. */
  public A071350() {
    super(1, new A058250().skip());
  }
}
