package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110161.
 * @author Sean A. Irvine
 */
public class A110161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110161() {
    super(new long[] {-1, 0, 1, 0}, new long[] {0, 1, 0, 0});
  }
}
