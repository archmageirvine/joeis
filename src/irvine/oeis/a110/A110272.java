package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110272 <code>a(n) = Pell(n)^3</code>.
 * @author Sean A. Irvine
 */
public class A110272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110272() {
    super(new long[] {-1, -12, 30, 12}, new long[] {0, 1, 8, 125});
  }
}
