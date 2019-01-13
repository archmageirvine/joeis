package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154151.
 * @author Sean A. Irvine
 */
public class A154151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154151() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {0, 18, 21, 111, 128});
  }
}
