package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182409.
 * @author Sean A. Irvine
 */
public class A182409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182409() {
    super(new long[] {1, -3, 3}, new long[] {-1583, -1567, -1543});
  }
}
