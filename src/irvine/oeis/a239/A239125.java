package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239125.
 * @author Sean A. Irvine
 */
public class A239125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239125() {
    super(new long[] {-1024, 1536, -512, 0, 0, 0, 0, 0, 0, -2, 3}, new long[] {1, 1, 3, 3, 3, 19, 19, 19, 19, 19, 531});
  }
}
