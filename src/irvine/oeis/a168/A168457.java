package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168457.
 * @author Sean A. Irvine
 */
public class A168457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168457() {
    super(new long[] {-1, 1, 1}, new long[] {2, 12, 12});
  }
}
