package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036239 Number of 2-element intersecting families of an n-element set; number of 2-way interactions when 2 subsets of power set on {1..n} are chosen at random.
 * @author Sean A. Irvine
 */
public class A036239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036239() {
    super(new long[] {-24, 50, -35, 10}, new long[] {0, 2, 15, 80});
  }
}
