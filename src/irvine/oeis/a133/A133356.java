package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133356 a(n) = 2*a(n-1) + 16*a(n-2) for n&gt;1, a(0)=1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A133356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133356() {
    super(new long[] {16, 2}, new long[] {1, 1});
  }
}
