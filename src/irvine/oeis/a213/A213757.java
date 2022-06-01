package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213757 Principal diagonal of the convolution array A213756.
 * @author Sean A. Irvine
 */
public class A213757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213757() {
    super(new long[] {4, -16, 25, -19, 7}, new long[] {1, 14, 65, 214, 597});
  }
}
