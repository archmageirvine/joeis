package irvine.oeis.a015;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a065.A065387;

/**
 * A015702 Numbers k where phi(k) + sigma(k) increases to a record value.
 * @author Sean A. Irvine
 */
public class A015702 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A015702() {
    super(1, new A065387(), 1);
  }
}
