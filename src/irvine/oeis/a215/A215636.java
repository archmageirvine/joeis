package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215636.
 * @author Sean A. Irvine
 */
public class A215636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215636() {
    super(new long[] {-2, -36, -105, -112, -54, -12}, new long[] {0, 0, 0, -3, 24, -135});
  }
}
