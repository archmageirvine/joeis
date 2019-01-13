package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228319.
 * @author Sean A. Irvine
 */
public class A228319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228319() {
    super(new long[] {1, -3, 3}, new long[] {20, 45, 82});
  }
}
