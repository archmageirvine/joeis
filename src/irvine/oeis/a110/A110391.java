package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110391.
 * @author Sean A. Irvine
 */
public class A110391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110391() {
    super(new long[] {-1, 2, 2}, new long[] {1, 4, 6});
  }
}
