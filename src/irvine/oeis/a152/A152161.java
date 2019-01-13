package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152161.
 * @author Sean A. Irvine
 */
public class A152161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152161() {
    super(new long[] {1, -3, 3}, new long[] {21, 221, 621});
  }
}
