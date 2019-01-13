package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122061.
 * @author Sean A. Irvine
 */
public class A122061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122061() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 6, 18, 40, 35, 66, 112, 176, 117, 190, 286, 408});
  }
}
