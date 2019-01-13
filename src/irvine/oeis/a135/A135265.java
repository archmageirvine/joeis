package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135265.
 * @author Sean A. Irvine
 */
public class A135265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135265() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 1, 1, 2});
  }
}
