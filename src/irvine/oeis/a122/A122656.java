package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122656.
 * @author Sean A. Irvine
 */
public class A122656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122656() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 2, 3, 16, 20, 54});
  }
}
