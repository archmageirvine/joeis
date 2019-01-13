package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122604.
 * @author Sean A. Irvine
 */
public class A122604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122604() {
    super(new long[] {1, -5, -10, 20, 15, -21, -7, 8, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
