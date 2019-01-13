package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047946.
 * @author Sean A. Irvine
 */
public class A047946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047946() {
    super(new long[] {-1, 2, 2}, new long[] {3, 2, 8});
  }
}
