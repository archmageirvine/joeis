package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108680.
 * @author Sean A. Irvine
 */
public class A108680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108680() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 18, 140, 700, 2646, 8232, 22176, 53460, 117975});
  }
}
