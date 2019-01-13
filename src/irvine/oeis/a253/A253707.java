package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253707.
 * @author Sean A. Irvine
 */
public class A253707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253707() {
    super(new long[] {-1, 4, -6, 4}, new long[] {17, 98, 291, 644});
  }
}
