package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206351.
 * @author Sean A. Irvine
 */
public class A206351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206351() {
    super(new long[] {1, -8, 8}, new long[] {1, 3, 16});
  }
}
