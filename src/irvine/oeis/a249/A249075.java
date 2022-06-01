package irvine.oeis.a249;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A249075 Sum of the numbers in row n of the array at A249074.
 * a[n] == a[n-1] + 2*(n+1)*a[n-2], a[0] == 1, a[1] == 5
 * @author Georg Fischer
 */
public class A249075 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A249075() {
    super(0, "[[0],[2, 2],[1],[-1]", "1, 5", 0);
  }
}
