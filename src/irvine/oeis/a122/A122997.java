package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122997 Pentanacci numbers for following initial values: <code>a[0] = 1</code>; <code>a[1] = -1</code>; <code>a[2] = 1</code>; <code>a[3] = -1</code>; <code>a[4] = 1</code>;.
 * @author Sean A. Irvine
 */
public class A122997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122997() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {1, -1, 1, -1, 1});
  }
}
