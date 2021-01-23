package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083337 a(n) = 2*a(n-1) + 2*a(n-2); a(0)=0, a(1)=3.
 * @author Sean A. Irvine
 */
public class A083337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083337() {
    super(new long[] {2, 2}, new long[] {0, 3});
  }
}
