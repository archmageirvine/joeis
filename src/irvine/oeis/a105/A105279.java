package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105279 <code>a(0)=0</code>; <code>a(n) = 10*a(n-1) + 10</code>.
 * @author Sean A. Irvine
 */
public class A105279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105279() {
    super(new long[] {-10, 11}, new long[] {0, 10});
  }
}
