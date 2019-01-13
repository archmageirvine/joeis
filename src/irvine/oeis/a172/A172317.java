package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172317.
 * @author Sean A. Irvine
 */
public class A172317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172317() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 64, 128});
  }
}
