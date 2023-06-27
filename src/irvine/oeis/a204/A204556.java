package irvine.oeis.a204;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A204556 Left edge of the triangle A045975.
 * @author Sean A. Irvine
 */
public class A204556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204556() {
    super(1, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 9, 24, 45, 90, 133});
  }
}
