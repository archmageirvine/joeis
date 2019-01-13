package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110293.
 * @author Sean A. Irvine
 */
public class A110293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110293() {
    super(new long[] {-1, 0, 14, 0}, new long[] {1, 7, 13, 97});
  }
}
