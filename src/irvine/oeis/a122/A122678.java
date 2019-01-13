package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122678.
 * @author Sean A. Irvine
 */
public class A122678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122678() {
    super(new long[] {1, -4, 4}, new long[] {1, 6, 21});
  }
}
