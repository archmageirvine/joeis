package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127146 Q(n,4), where Q(m,k) is defined in A127080 and A127137.
 * @author Sean A. Irvine
 */
public class A127146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127146() {
    super(new long[] {1, -3, 3}, new long[] {12, 3, -4});
  }
}
