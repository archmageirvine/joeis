package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051176 If <code>n mod 3 = 0</code> then <code>n/3</code> else <code>n</code>.
 * @author Sean A. Irvine
 */
public class A051176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051176() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 2, 1, 4, 5});
  }
}
