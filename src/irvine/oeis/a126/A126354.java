package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126354.
 * @author Sean A. Irvine
 */
public class A126354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126354() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 0, 3, 2});
  }
}
