package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025776.
 * @author Sean A. Irvine
 */
public class A025776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025776() {
    super(new long[] {1, -1, 0, 0, 0, -1, 0, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 4, 5});
  }
}
