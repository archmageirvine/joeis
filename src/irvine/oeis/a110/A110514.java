package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110514.
 * @author Sean A. Irvine
 */
public class A110514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110514() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, -1, 2, 0, 3, -1});
  }
}
