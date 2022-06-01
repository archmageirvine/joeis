package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247344 a(n) = 1 for n &lt;= 4; a(n) = 25*a(n-1) - 200*a(n-2) + 800*a(n-3) - 1600*a(n-4) + 1280*a(n-5) otherwise.
 * @author Sean A. Irvine
 */
public class A247344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247344() {
    super(new long[] {1280, -1600, 800, -200, 25}, new long[] {1, 1, 1, 1, 1});
  }
}
