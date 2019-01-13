package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017394.
 * @author Sean A. Irvine
 */
public class A017394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017394() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1771561, 113379904, 1291467969, 7256313856L, 27680640625L, 82653950016L});
  }
}
