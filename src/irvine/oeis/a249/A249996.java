package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249996.
 * @author Sean A. Irvine
 */
public class A249996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249996() {
    super(new long[] {24, 14, -1}, new long[] {1, -1, 15});
  }
}
