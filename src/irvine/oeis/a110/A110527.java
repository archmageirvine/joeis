package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110527.
 * @author Sean A. Irvine
 */
public class A110527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110527() {
    super(new long[] {1, 5, 3}, new long[] {0, 1, 8});
  }
}
