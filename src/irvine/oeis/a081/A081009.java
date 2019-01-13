package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081009.
 * @author Sean A. Irvine
 */
public class A081009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081009() {
    super(new long[] {1, -8, 8}, new long[] {1, 12, 88});
  }
}
