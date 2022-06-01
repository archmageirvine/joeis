package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115099 a(0)=4, a(n) = 3*a(n-1) - 4.
 * @author Sean A. Irvine
 */
public class A115099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115099() {
    super(new long[] {-3, 4}, new long[] {4, 8});
  }
}
