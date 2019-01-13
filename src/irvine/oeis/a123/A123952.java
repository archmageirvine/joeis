package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123952.
 * @author Sean A. Irvine
 */
public class A123952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123952() {
    super(new long[] {110, -72, 15}, new long[] {1, 4, 17});
  }
}
