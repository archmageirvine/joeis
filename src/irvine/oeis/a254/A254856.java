package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254856.
 * @author Sean A. Irvine
 */
public class A254856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254856() {
    super(new long[] {1, -1, -26, 26, 1}, new long[] {1, 2, 15, 40, 377});
  }
}
