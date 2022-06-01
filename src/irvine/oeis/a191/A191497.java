package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191497 a(n+1) = 2*a(n) + A014017(n+5), a(0) = 0.
 * @author Sean A. Irvine
 */
public class A191497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191497() {
    super(new long[] {2, -1, 0, 0, 2}, new long[] {0, 0, 0, 0, 1});
  }
}
