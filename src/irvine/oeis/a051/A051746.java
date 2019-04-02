package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051746 a(n) = n(n+7)(n+1)(n^2+2n+12)/120.
 * @author Sean A. Irvine
 */
public class A051746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051746() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 9, 27, 66, 141, 273});
  }
}
