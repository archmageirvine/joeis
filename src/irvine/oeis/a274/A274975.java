package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274975.
 * @author Sean A. Irvine
 */
public class A274975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274975() {
    super(new long[] {-1, 1, 2}, new long[] {3, 2, 6});
  }
}
