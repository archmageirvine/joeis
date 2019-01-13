package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161710.
 * @author Sean A. Irvine
 */
public class A161710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161710() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 3, 4, 6, 8, 12, 24});
  }
}
