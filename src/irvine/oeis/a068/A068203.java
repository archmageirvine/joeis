package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068203.
 * @author Sean A. Irvine
 */
public class A068203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068203() {
    super(new long[] {-1, 30}, new long[] {1, 15});
  }
}
