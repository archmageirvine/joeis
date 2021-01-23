package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081193 a(n) = 6*a(n-1)-8*a(n-2) for n&gt;1, a(0)=1, a(1)=9.
 * @author Sean A. Irvine
 */
public class A081193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081193() {
    super(new long[] {-8, 6}, new long[] {1, 9});
  }
}
