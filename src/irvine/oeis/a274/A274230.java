package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274230.
 * @author Sean A. Irvine
 */
public class A274230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274230() {
    super(new long[] {4, -6, 0, 3}, new long[] {0, 0, 1, 3});
  }
}
