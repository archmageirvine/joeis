package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110512.
 * @author Sean A. Irvine
 */
public class A110512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110512() {
    super(new long[] {-2, -1}, new long[] {1, 0});
  }
}
