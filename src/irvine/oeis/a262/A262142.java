package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262142.
 * @author Sean A. Irvine
 */
public class A262142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262142() {
    super(new long[] {1, -39, 39}, new long[] {171, 6660, 253071});
  }
}
