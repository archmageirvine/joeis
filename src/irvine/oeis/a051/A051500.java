package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051500.
 * @author Sean A. Irvine
 */
public class A051500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051500() {
    super(new long[] {27, -39, 13}, new long[] {1, 4, 25});
  }
}
