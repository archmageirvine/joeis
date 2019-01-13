package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005022.
 * @author Sean A. Irvine
 */
public class A005022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005022() {
    super(new long[] {4, -10, 6}, new long[] {6, 26, 100});
  }
}
