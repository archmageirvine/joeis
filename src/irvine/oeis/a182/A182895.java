package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182895.
 * @author Sean A. Irvine
 */
public class A182895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182895() {
    super(new long[] {-1, 2, 1, 2}, new long[] {0, 1, 3, 7});
  }
}
