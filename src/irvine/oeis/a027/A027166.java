package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027166 a(n) = Sum_{0&lt;=j&lt;=i&lt;=n} A027157(i, j).
 * @author Sean A. Irvine
 */
public class A027166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027166() {
    super(new long[] {3, -6, 9, -12, 5, 2}, new long[] {1, 4, 14, 36, 103, 248});
  }
}
