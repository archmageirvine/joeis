package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110111.
 * @author Sean A. Irvine
 */
public class A110111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110111() {
    super(new long[] {-729, -189, 84, 7}, new long[] {0, 1, 7, 133});
  }
}
