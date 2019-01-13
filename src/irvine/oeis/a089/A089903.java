package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089903.
 * @author Sean A. Irvine
 */
public class A089903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089903() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 1, 48, 960});
  }
}
