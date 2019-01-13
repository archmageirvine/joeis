package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087475.
 * @author Sean A. Irvine
 */
public class A087475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087475() {
    super(new long[] {1, -3, 3}, new long[] {4, 5, 8});
  }
}
