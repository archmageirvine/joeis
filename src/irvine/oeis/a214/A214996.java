package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214996.
 * @author Sean A. Irvine
 */
public class A214996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214996() {
    super(new long[] {-2, 2, 3}, new long[] {3, 11, 37});
  }
}
