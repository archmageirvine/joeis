package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193391.
 * @author Sean A. Irvine
 */
public class A193391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193391() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 109, 271, 529});
  }
}
