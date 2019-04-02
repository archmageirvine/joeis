package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158480 12n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158480() {
    super(new long[] {1, -3, 3}, new long[] {13, 49, 109});
  }
}
