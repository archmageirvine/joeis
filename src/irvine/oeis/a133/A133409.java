package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133409.
 * @author Sean A. Irvine
 */
public class A133409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133409() {
    super(new long[] {-3, 4, -1, -3, 4}, new long[] {0, 0, 0, 0, 1});
  }
}
