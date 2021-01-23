package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051462 Molien series for group G_{1,2}^{8} of order 1536.
 * @author Sean A. Irvine
 */
public class A051462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051462() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {1, 4, 11, 25, 48, 83});
  }
}
