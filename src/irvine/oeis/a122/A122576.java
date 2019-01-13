package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122576.
 * @author Sean A. Irvine
 */
public class A122576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122576() {
    super(new long[] {1, 1, -3, -3, 3, 3, -1}, new long[] {-1, 3, -12, 20, -45, 63, -112});
  }
}
