package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161495.
 * @author Sean A. Irvine
 */
public class A161495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161495() {
    super(new long[] {-1, 15, -32, 15}, new long[] {3, 35, 432, 5405});
  }
}
