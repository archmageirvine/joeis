package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226695.
 * @author Sean A. Irvine
 */
public class A226695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226695() {
    super(new long[] {-1, 4098}, new long[] {1, 4097});
  }
}
