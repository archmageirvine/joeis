package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070893.
 * @author Sean A. Irvine
 */
public class A070893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070893() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 6, 19, 46, 94, 172});
  }
}
