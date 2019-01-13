package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248089.
 * @author Sean A. Irvine
 */
public class A248089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248089() {
    super(new long[] {-27, 64, -48, 12}, new long[] {1, 4, 16, 64});
  }
}
