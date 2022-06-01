package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036354 Heptagonal square numbers.
 * @author Sean A. Irvine
 */
public class A036354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036354() {
    super(new long[] {1, -1, 0, -2079362, 2079362, 0, 1}, new long[] {1, 81, 5929, 2307361, 168662169, 12328771225L, 4797839017609L});
  }
}
