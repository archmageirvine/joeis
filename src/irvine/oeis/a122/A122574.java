package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122574.
 * @author Sean A. Irvine
 */
public class A122574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122574() {
    super(new long[] {1, -11}, new long[] {1, 1});
  }
}
