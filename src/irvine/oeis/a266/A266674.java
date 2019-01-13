package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266674.
 * @author Sean A. Irvine
 */
public class A266674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266674() {
    super(new long[] {2048, 0, -3456, -256, 1616, 432, -216, -202, 8, 27, 0}, new long[] {1, 1, 10, 75, 76, 1623, 600, 29295, 4784, 496351, 37728});
  }
}
