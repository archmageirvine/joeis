package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233000.
 * @author Sean A. Irvine
 */
public class A233000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233000() {
    super(new long[] {1, -3, -3, 12, 0, -12, 3, 3}, new long[] {16, 5, 25, 20, 81, 125, 400, 845});
  }
}
