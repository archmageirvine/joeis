package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051063 <code>27*n+9</code> or <code>27*n+18</code>.
 * @author Sean A. Irvine
 */
public class A051063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051063() {
    super(new long[] {-1, 1, 1}, new long[] {9, 18, 36});
  }
}
