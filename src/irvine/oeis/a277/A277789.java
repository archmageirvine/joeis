package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277789.
 * @author Sean A. Irvine
 */
public class A277789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277789() {
    super(new long[] {1, -3, 0, 4, -1}, new long[] {1, -1, 4, -10, 23});
  }
}
