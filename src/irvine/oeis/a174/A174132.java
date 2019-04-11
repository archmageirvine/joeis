package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174132 <code>2*3^(n-1)-(-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A174132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174132() {
    super(new long[] {3, 2}, new long[] {3, 5});
  }
}
