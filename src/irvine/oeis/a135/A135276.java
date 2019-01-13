package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135276.
 * @author Sean A. Irvine
 */
public class A135276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135276() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 3, 4, 8});
  }
}
