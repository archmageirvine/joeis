package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086864.
 * @author Sean A. Irvine
 */
public class A086864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086864() {
    super(new long[] {243, -405, 270, -90, 15}, new long[] {0, 0, 0, 1, 30});
  }
}
