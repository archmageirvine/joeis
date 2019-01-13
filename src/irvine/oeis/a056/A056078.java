package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056078.
 * @author Sean A. Irvine
 */
public class A056078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056078() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 2, 15, 54, 141});
  }
}
