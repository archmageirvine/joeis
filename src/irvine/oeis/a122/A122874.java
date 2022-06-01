package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122874 List of pairs n+7, 13-n, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A122874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122874() {
    super(new long[] {1, 1, -1}, new long[] {7, 13, 8});
  }
}
