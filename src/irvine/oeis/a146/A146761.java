package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146761.
 * @author Sean A. Irvine
 */
public class A146761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146761() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 0, 6, 6, 3});
  }
}
