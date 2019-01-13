package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226199.
 * @author Sean A. Irvine
 */
public class A226199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226199() {
    super(new long[] {7, -15, 9}, new long[] {1, 8, 51});
  }
}
