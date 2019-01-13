package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122650.
 * @author Sean A. Irvine
 */
public class A122650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122650() {
    super(new long[] {1, 1}, new long[] {28657, 46368});
  }
}
