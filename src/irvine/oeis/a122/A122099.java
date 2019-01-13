package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122099.
 * @author Sean A. Irvine
 */
public class A122099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122099() {
    super(new long[] {1, 0, -3}, new long[] {1, 1, 0});
  }
}
