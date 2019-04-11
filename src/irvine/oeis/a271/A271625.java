package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271625 <code>a(n) = 2n^2 + 4n - 3</code>.
 * @author Sean A. Irvine
 */
public class A271625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271625() {
    super(new long[] {1, -3, 3}, new long[] {3, 13, 27});
  }
}
