package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097766 Pell equation solutions (11*a(n))^2 - 122*b(n)^2 = -1 with b(n):=A097767(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097766() {
    super(new long[] {-1, 486}, new long[] {1, 487});
  }
}
