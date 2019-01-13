package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051867.
 * @author Sean A. Irvine
 */
public class A051867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051867() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 15});
  }
}
