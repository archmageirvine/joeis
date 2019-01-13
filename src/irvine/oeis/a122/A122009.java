package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122009.
 * @author Sean A. Irvine
 */
public class A122009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122009() {
    super(new long[] {2, -15, 12}, new long[] {1, 1, 3});
  }
}
