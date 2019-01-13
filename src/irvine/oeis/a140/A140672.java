package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140672.
 * @author Sean A. Irvine
 */
public class A140672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140672() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 19});
  }
}
