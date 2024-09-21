package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081682 a(n) = (9^n - 8^n - 7^n - 6^n + 4*5^n)/2.
 * @author Sean A. Irvine
 */
public class A081682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081682() {
    super(new long[] {15120, -11274, 3325, -485, 35}, new long[] {1, 4, 16, 79, 634});
  }
}
