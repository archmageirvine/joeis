package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266708.
 * @author Sean A. Irvine
 */
public class A266708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266708() {
    super(new long[] {-1, 2, 2}, new long[] {0, -10, -18});
  }
}
