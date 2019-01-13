package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122653.
 * @author Sean A. Irvine
 */
public class A122653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122653() {
    super(new long[] {-1, 10}, new long[] {0, 6});
  }
}
