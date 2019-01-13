package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051947.
 * @author Sean A. Irvine
 */
public class A051947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051947() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 10, 49, 168, 462, 1092, 2310});
  }
}
