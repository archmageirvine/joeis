package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017954.
 * @author Sean A. Irvine
 */
public class A017954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017954() {
    super(new long[] {216, -126, 21}, new long[] {1, 21, 315});
  }
}
