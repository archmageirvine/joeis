package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127147 Q(n,5), where Q(m,k) is defined in A127080 and A127137.
 * @author Sean A. Irvine
 */
public class A127147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127147() {
    super(new long[] {1, -3, 3}, new long[] {43, 28, 15});
  }
}
