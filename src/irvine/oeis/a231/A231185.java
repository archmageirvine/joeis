package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231185.
 * @author Sean A. Irvine
 */
public class A231185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231185() {
    super(new long[] {1, -3, -3, 4, 1}, new long[] {1, 0, 4, 1, 14});
  }
}
