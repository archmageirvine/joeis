package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122997 Pentanacci numbers for following initial values: a(0) = 1, a(1) = -1, a(2) = 1, a(3) = -1, a(4) = 1.
 * @author Sean A. Irvine
 */
public class A122997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122997() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {1, -1, 1, -1, 1});
  }
}
