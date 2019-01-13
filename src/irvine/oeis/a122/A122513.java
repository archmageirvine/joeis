package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122513.
 * @author Sean A. Irvine
 */
public class A122513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122513() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {0, 1, 46, 135, 4540});
  }
}
