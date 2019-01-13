package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081008.
 * @author Sean A. Irvine
 */
public class A081008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081008() {
    super(new long[] {1, -8, 8}, new long[] {0, 7, 54});
  }
}
