package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051939.
 * @author Sean A. Irvine
 */
public class A051939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051939() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 13, 31, 58});
  }
}
