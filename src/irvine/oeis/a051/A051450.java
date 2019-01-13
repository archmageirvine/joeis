package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051450.
 * @author Sean A. Irvine
 */
public class A051450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051450() {
    super(new long[] {1, -2, -3, 4}, new long[] {1, 2, 5, 12});
  }
}
