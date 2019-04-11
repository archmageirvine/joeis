package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052103 The third of the three sequences associated with the polynomial <code>x^3 - 2</code>.
 * @author Sean A. Irvine
 */
public class A052103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052103() {
    super(new long[] {3, -3, 3}, new long[] {0, 0, 1});
  }
}
