package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036240 Number of 3-way interactions when 3 subsets of power set on <code>{1</code>..n} are chosen at random; number of Boolean functions of n variables and rank 3 from Post class F(8,inf).
 * @author Sean A. Irvine
 */
public class A036240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036240() {
    super(new long[] {-1344, 3160, -2734, 1135, -241, 25}, new long[] {0, 0, 12, 200, 2280, 22420});
  }
}
