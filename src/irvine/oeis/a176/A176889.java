package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176889.
 * @author Sean A. Irvine
 */
public class A176889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176889() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 2, 1, 8, 1, 18});
  }
}
