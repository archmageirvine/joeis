package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027382.
 * @author Sean A. Irvine
 */
public class A027382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027382() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 9, 16, 49});
  }
}
