package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067902 <code>a(n) = 14*a(n-1) - a(n-2); a(0) = 2, a(1) = 14</code>.
 * @author Sean A. Irvine
 */
public class A067902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067902() {
    super(new long[] {-1, 14}, new long[] {2, 14});
  }
}
