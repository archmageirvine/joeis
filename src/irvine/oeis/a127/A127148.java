package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127148 Q(n,6), where Q(m,k) is defined in A127080 and A127137.
 * @author Sean A. Irvine
 */
public class A127148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127148() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-120, -15, 48, 75});
  }
}
