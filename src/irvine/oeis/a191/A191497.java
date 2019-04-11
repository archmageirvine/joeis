package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191497 <code>a(n+1) = 2*a(n) +</code> A014017(n+5), <code>a(0) = 0</code>.
 * @author Sean A. Irvine
 */
public class A191497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191497() {
    super(new long[] {2, -1, 0, 0, 2}, new long[] {0, 0, 0, 0, 1});
  }
}
