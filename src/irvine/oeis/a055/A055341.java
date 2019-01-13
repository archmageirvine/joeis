package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055341.
 * @author Sean A. Irvine
 */
public class A055341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055341() {
    super(new long[] {1, -3, 2, 1, 0, -1, -2, 3}, new long[] {1, 3, 8, 19, 37, 66, 110, 172});
  }
}
