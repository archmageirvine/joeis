package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136258 a(n) = 2*a(n-1) - 2*a(n-2), with a(0)=1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A136258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136258() {
    super(new long[] {-2, 2}, new long[] {1, 5});
  }
}
