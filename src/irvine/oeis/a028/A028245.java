package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028245 <code>a(n) = 5^(n-1) - 4*4^(n-1) + 6*3^(n-1) - 4*2^(n-1) + 1</code> (essentially Stirling numbers of second kind).
 * @author Sean A. Irvine
 */
public class A028245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028245() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {0, 0, 0, 0, 24});
  }
}
