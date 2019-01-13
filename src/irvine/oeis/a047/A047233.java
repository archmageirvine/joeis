package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047233.
 * @author Sean A. Irvine
 */
public class A047233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047233() {
    super(new long[] {-1, 1, 1}, new long[] {0, 4, 6});
  }
}
