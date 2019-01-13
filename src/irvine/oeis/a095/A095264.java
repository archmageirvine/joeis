package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095264.
 * @author Sean A. Irvine
 */
public class A095264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095264() {
    super(new long[] {2, -5, 4}, new long[] {1, 6, 19});
  }
}
