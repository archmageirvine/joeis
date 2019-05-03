package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022107 Fibonacci sequence beginning <code>1, 17</code>.
 * @author Sean A. Irvine
 */
public class A022107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022107() {
    super(new long[] {1, 1}, new long[] {1, 17});
  }
}
