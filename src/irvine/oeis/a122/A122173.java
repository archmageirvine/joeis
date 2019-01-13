package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122173.
 * @author Sean A. Irvine
 */
public class A122173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122173() {
    super(new long[] {1, -12, 34, -30, 6, 3}, new long[] {1, -5, 10, -45, 110, -421});
  }
}
