package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109044 <code>a(n) = lcm(n,3)</code>.
 * @author Sean A. Irvine
 */
public class A109044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109044() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 3, 6, 3, 12, 15});
  }
}
