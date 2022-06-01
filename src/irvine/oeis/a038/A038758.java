package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038758 Number of ways of covering a 2n X 2n lattice by 2n^2 dominoes with exactly 4 horizontal (or vertical) dominoes.
 * @author Sean A. Irvine
 */
public class A038758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038758() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {16, 281, 1785, 7175, 22015, 56406, 126966});
  }
}
