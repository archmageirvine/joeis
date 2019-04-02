package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274759 Modified quadranacci series.
 * @author Sean A. Irvine
 */
public class A274759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274759() {
    super(new long[] {1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0}, new long[] {0, 1, 1, 1, 1, 2, 2, 2, 3, 4, 4, 6});
  }
}
