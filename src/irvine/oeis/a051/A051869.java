package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051869 <code>17-gonal</code> (or heptadecagonal) numbers: <code>n(15n-13)/2</code>.
 * @author Sean A. Irvine
 */
public class A051869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051869() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 17});
  }
}
