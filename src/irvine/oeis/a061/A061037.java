package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061037.
 * @author Sean A. Irvine
 */
public class A061037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061037() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 5, 3, 21, 2, 45, 15, 77, 6, 117, 35, 165});
  }
}
