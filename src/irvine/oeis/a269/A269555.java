package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269555.
 * @author Sean A. Irvine
 */
public class A269555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269555() {
    super(new long[] {1, -99, 99}, new long[] {7, 439, 42767});
  }
}
