package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051436.
 * @author Sean A. Irvine
 */
public class A051436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051436() {
    super(new long[] {36, -30, -60, 55, 25, -30, 0, 5}, new long[] {1, 2, 5, 12, 39, 111, 350, 1044});
  }
}
