package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007483 a(n) = 3*a(n-1) + 2*a(n-2), with a(0)=1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A007483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007483() {
    super(new long[] {2, 3}, new long[] {1, 5});
  }
}

