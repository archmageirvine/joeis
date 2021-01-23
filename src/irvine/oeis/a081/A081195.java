package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081195 a(n) = 10*a(n-1)-24*a(n-2) for n&gt;1, a(0)=1, a(1)=25.
 * @author Sean A. Irvine
 */
public class A081195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081195() {
    super(new long[] {-24, 10}, new long[] {1, 25});
  }
}
