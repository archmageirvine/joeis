package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193045.
 * @author Sean A. Irvine
 */
public class A193045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193045() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {0, 1, 1, 3, 8, 21});
  }
}
