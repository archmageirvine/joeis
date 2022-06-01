package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219205 3^(n-1)*(3^n - 1), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A219205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219205() {
    super(new long[] {-27, 12}, new long[] {0, 2});
  }
}
