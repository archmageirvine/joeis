package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143856.
 * @author Sean A. Irvine
 */
public class A143856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143856() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 55});
  }
}
