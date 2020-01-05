package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242412 <code>a(n) = (2n-1)^2 + 14</code>.
 * @author Sean A. Irvine
 */
public class A242412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242412() {
    super(new long[] {1, -3, 3}, new long[] {15, 23, 39});
  }
}
