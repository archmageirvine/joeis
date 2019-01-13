package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133499.
 * @author Sean A. Irvine
 */
public class A133499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133499() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 126, 2184, 16380, 78120, 279930, 823536});
  }
}
