package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052102 The second of the three sequences associated with the polynomial <code>x^3 - 2</code>.
 * @author Sean A. Irvine
 */
public class A052102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052102() {
    super(new long[] {3, -3, 3}, new long[] {0, 1, 2});
  }
}
