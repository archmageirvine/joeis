package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123116 Values y of solutions (x, y) to the Diophantine equation (x-y)^4 - 8*x*y = 0 with x &gt;= y.
 * @author Sean A. Irvine
 */
public class A123116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123116() {
    super(new long[] {-1, 40, -206, 40}, new long[] {0, 4, 192, 6860});
  }
}
