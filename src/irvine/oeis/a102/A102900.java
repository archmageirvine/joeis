package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102900 a(n) = 3*a(n-1) + 4*a(n-2), a(0)=a(1)=1.
 * @author Sean A. Irvine
 */
public class A102900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102900() {
    super(new long[] {4, 3}, new long[] {1, 1});
  }
}
