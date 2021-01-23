package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186813 a(n) = n if n odd, a(2n) = 3n if n odd, a(4n) = 2n.
 * @author Sean A. Irvine
 */
public class A186813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186813() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 1, 3, 3, 2, 5});
  }
}
