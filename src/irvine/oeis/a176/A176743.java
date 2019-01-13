package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176743.
 * @author Sean A. Irvine
 */
public class A176743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176743() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 3, 2, 10, 3, 7, 4, 18});
  }
}
