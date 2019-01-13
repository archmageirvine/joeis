package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081079.
 * @author Sean A. Irvine
 */
public class A081079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081079() {
    super(new long[] {1, -8, 8}, new long[] {0, 15, 120});
  }
}
