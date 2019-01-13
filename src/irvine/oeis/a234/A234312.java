package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234312.
 * @author Sean A. Irvine
 */
public class A234312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234312() {
    super(new long[] {2, 0, 0, 2, 0}, new long[] {1, 0, 2, 0, 4});
  }
}
