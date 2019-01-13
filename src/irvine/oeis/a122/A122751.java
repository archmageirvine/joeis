package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122751.
 * @author Sean A. Irvine
 */
public class A122751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122751() {
    super(new long[] {1, -3, 2, 2, -4, 4, -2, -2, 3}, new long[] {1, 2, 7, 14, 29, 49, 83, 127, 192});
  }
}
