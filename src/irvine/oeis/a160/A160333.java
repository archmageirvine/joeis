package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160333 Number of pairs of rabbits in month n in the dying rabbits problem, if they become mature after 4 months and give birth to exactly 7 pairs, one per month.
 * @author Sean A. Irvine
 */
public class A160333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160333() {
    super(new long[] {1, 0, 1, 0, 1, 0, 1, -1, 1}, new long[] {1, 1, 1, 1, 2, 3, 4, 5, 7});
  }
}
