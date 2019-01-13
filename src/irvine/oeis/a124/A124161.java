package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124161.
 * @author Sean A. Irvine
 */
public class A124161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124161() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 3, 15, 48, 121});
  }
}
